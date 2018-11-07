package reusing;

import static util.Print.print;

class WaterSource {
    private String s;

    public WaterSource() {
        print("WaterSource()");
        s = "constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    // Initializing at point of definition:
    private String v1 = "Happy", v2, v3, v4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    // Instance initialization:
    public SprinklerSystem() {
        v2 = "Happy2";
    }

    @Override
    public String toString() {
        // Delayed initialization
        v3 = "Joy";
        return "v1 = " + v1 + " " +
                "v2 = " + v2 + " " +
                "v3 = " + v3 + " " +
                "v4 = " + v4 + " " +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        print(sprinklerSystem);
    }
}