package generics;

import net.mindview.util.FiveTuple;

class Amphibian {
}

class Vehicle {
}

public class TupleTest {
    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(
                new Vehicle(), new Amphibian(), "hi", 47, 11.11);
    }

    public static void main(String[] args) {
        System.out.println(k());
    }
}
