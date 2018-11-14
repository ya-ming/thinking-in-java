package holding;

import typeinfo.pets.*;

import java.util.*;

import static net.mindview.util.Print.*;

public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople = new HashMap<>();

    static {
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Elsie May"), new Dog("Margrett")));
    }

    public static void main(String[] args) {
        print(petPeople.keySet());
        for (Person person : petPeople.keySet()) {
            print(person + " has:");
            for (Pet pet : petPeople.get(person)) {
                print("     " + pet);
            }
        }
    }
}
