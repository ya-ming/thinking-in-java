package holding;

import java.util.*;

import typeinfo.pets.*;

import static net.mindview.util.Print.*;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        print(pets);

        print("pets.getFirst(): " + pets.getFirst());
        print("pets.element(): " + pets.element());

        print("pets.peek(): " + pets.peek());

        print("pets.removeFirst(): " + pets.removeFirst());
        print("pets.remove(): " + pets.remove());

        print("pets.poll(): " + pets.poll());
        print(pets);

        pets.addFirst(new Rat());
        print("After addFirst(): " + pets);

        pets.offer(Pets.randomPet());
        print("After offer(): " + pets);
        pets.offer(Pets.randomPet());
        print("After offer(): " + pets);

        pets.add(Pets.randomPet());
        print("After add(): " + pets);

        pets.addLast(Pets.randomPet());
        print("After addLast(): " + pets);

        pets.removeLast();
        print("After removeLast: " + pets);


    }

}
