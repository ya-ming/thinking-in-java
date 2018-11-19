package holding;

import java.util.*;

import static net.mindview.util.Print.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        print(collection);

        Integer[] moreInts = {6, 7, 8, 9, 10};

        collection.addAll(Arrays.asList(moreInts));
        print(collection);

        Collections.addAll(collection, 11, 12, 13, 14, 15);
        print(collection);

        Collections.addAll(collection, moreInts);
        print(collection);

        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        print(list);

        list.set(1, 99);

        // Runtime error because the underlying array cannot be resized.
        // list.add(21);
    }
}
