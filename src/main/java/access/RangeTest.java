package access;

import static util.Print.print;
import static util.Range.*;

public class RangeTest {
    public static void main(String[] args) {
        int [] range1 = range(10);
        int [] range2 = range(10, 20);
        int [] range3 = range(100, 110, 3);

        print(range1.length);
    }
}