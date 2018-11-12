package holding;

import typeinfo.pets.*;
import java.util.*;
import static net.mindview.util.Print.*;

public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);

        Iterator<Pet> it = pets.iterator();
        while(it.hasNext()) {
            Pet p = it.next();
            printnb(p.id() + ":" + p + " ");
        }
        print();

        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        print(pets);
    }
}
