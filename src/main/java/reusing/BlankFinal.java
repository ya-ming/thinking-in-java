package reusing;

import static util.Print.print;

public class BlankFinal {
    private final int f;

    public BlankFinal(int f) {
        this.f = f;
    }

    public BlankFinal() {
        f = 0;
    }

    public static void main(String[] args) {
        BlankFinal f1 = new BlankFinal();
        BlankFinal f2 = new BlankFinal(2);

        print(f1);
        print(f2);
    }

    @Override
    public String toString() {
        return "f = " + f;
    }
}
