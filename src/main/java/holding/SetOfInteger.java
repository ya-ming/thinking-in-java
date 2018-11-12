package holding;

import java.util.*;

public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < 10000; i++)
            integerSet.add(rand.nextInt(30));

        System.out.println(integerSet);

        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 10000; i++)
            treeSet.add(rand.nextInt(30));

        System.out.println(treeSet);
    }
}
