package containers;

import java.util.*;

import net.mindview.util.*;

import static net.mindview.util.Print.*;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        RandomGenerator.String gen = new RandomGenerator.String(3);
        for (int i = 0; i < 10; i++) {
            treeSet.add(gen.next());
        }

        print(treeSet);
    }
}
