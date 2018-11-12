package holding;

import java.util.ArrayList;

import static net.mindview.util.Print.*;

public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        // Compile error
        // apples.add(new Orange());

        for (Apple apple : apples) {
            print(apple.id());
        }
    }
}
