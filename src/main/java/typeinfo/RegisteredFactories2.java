package typeinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part2 {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Class<? extends Part>> partClasses =
            new ArrayList<>();

    static {
        // Collections.addAll() gives an "unchecked generic
        // array creation ... for varargs parameter" warning.
        partClasses.add(FuelFilter.class);
        partClasses.add(AirFilter.class);
        partClasses.add(CabinAirFilter.class);
        partClasses.add(OilFilter.class);
        partClasses.add(FanBelt.class);
        partClasses.add(PowerSteeringBelt.class);
        partClasses.add(GeneratorBelt.class);
    }

    private static Random rand = new Random(47);

    public static Part createRandom() {
        int n = rand.nextInt(partClasses.size());
        try {
            return partClasses.get(n).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class RegisteredFactories2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println(Part2.createRandom());
    }
}
