package reusing;

import static net.mindview.util.Print.print;

class Cleanser {
    private String s = "Cleanser";

    public void scrub() {
        append(" scrub()");
    }

    public void append(String a) {
        s += a;
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.scrub();
        print(cleanser);
    }
}

public class Detergent extends Cleanser {
    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.scrub();
        print(detergent);
        Cleanser.main(args);
    }
}

