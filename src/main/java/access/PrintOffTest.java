package access;

import static net.mindview.util.PrintOff.*;

public class PrintOffTest {
    public static void main(String[] args) {
        print("Available from now on!");
        print(100);
        print(100L);
        print(3.14159);
        print("%s%d\n", "C style printf ", 100);
        print("end");
    }
}
