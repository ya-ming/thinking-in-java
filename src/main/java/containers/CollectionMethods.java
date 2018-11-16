package containers;

import net.mindview.util.Countries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static net.mindview.util.Print.print;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.addAll(Countries.names(6));
        c.add("ten");
        c.add("eleven");
        print(c);

        Object[] array = c.toArray();
        String[] str = c.toArray(new String[0]);

        print("Collections.max(c) = " + Collections.max(c));
        print("Collections.min(c) = " + Collections.min(c));

        Collection<String> c2 = new ArrayList<>();
        c2.addAll(c);
        print(c2);

        c.remove(Countries.DATA[0][0]);
        print(c);

        c.remove(Countries.DATA[1][0]);
        print(c);

        c.removeAll(c2);
        print(c);

        c.addAll(c2);
        print(c);

        String val = Countries.DATA[3][0];
        print("c.contans(" + val + ") = " + c.contains(val));
        print("c.contansAll(c2) = " + c.containsAll(c2));

        Collection<String> c3 = ((List<String>)c).subList(3, 5);
        c2.retainAll(c3);
        print(c2);

        c2.retainAll(c3);
        print("c2.isEmpty = " + c2.isEmpty());

        c.clear();
        print(c);
    }

}
