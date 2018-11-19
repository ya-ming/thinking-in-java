package reusing;

import static net.mindview.util.Print.print;

public class Sterilizer extends Detergent {
    @Override
    public void scrub() {
        append(" Sterilizer.scrub()");
        super.scrub();
    }

    public static void main(String[] args) {
        Sterilizer sterilizer = new Sterilizer();
        sterilizer.scrub();
        print(sterilizer);
        Detergent.main(args);
    }
}
