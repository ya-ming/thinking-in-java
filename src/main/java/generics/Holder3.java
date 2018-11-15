package generics;

import typeinfo.pets.Cat;
import typeinfo.pets.Cymric;
import typeinfo.pets.Pet;

public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    T get() {
        return a;
    }

    void set(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> holder2 = new Holder3(new Automobile());
        Automobile a = holder2.get();

        Holder3<Pet> petHolder = new Holder3<>(new Cat());
        petHolder.set(new Cymric());
    }
}
