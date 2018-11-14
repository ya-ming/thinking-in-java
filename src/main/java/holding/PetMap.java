package holding;

import typeinfo.pets.*;

import java.util.*;

import static net.mindview.util.Print.*;

public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));

        print(petMap);

        Pet dog = petMap.get("My Dog");
        print(dog);

        print(petMap.containsKey("My Dog"));
        print(petMap.containsValue(dog));
    }

}
