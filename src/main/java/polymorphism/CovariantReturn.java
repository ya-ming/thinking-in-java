package polymorphism;

import static net.mindview.util.Print.print;

class Grain {
    @Override
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    Wheat process() {
        return new Wheat();
    }
}

public class CovariantReturn {
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain grain = mill.process();
        print(grain);

        mill = new WheatMill();
        grain = mill.process();
        print(grain);
    }
}
