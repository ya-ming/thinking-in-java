package typeinfo;

import java.lang.reflect.*;
import java.util.HashMap;

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    private static HashMap<String, Integer> methodCounter = new HashMap<>();

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object
    invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args);

        Integer counter = methodCounter.get(method.getName());
        if (counter != null) {
            methodCounter.put(method.getName(), ++counter);
        } else {
            counter = 1;
            methodCounter.put(method.getName(), counter);
        }
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", called: " + counter + " times");

        if (args != null)
            for (Object arg : args)
                System.out.println("  " + arg);
        return method.invoke(proxied, args);
    }
}

class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        // Insert a proxy and call again:
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
        consumer(proxy);
        consumer(proxy);
    }
} /* Output: (95% match)	
doSomething
somethingElse bonobo
**** proxy: class $Proxy0, method: public abstract void Interface.doSomething(), args: null
doSomething
**** proxy: class $Proxy0, method: public abstract void Interface.somethingElse(java.lang.String), args: [Ljava.lang.Object;@42e816
  bonobo
somethingElse bonobo
*///:~
