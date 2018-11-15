package generics;

public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public <T, U, V> void f(T x, U y, V z) {
        System.out.println(x.getClass().getName() + ", " + y.getClass().getName() + ", " + z.getClass().getName());
    }


    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);

        gm.f(1, 1.0, 'c');
    }
}
