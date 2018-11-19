package generics;

public class Holder2 {
    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }

    Object get() {
        return a;
    }

    void set(Object a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder2 holder2 = new Holder2(new Automobile());
        Automobile a = (Automobile) holder2.get();
        holder2.set("Not an Automobile");
        String s = (String) holder2.get();
    }
}
