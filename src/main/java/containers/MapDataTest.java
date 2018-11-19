package containers;

import net.mindview.util.*;

import java.util.Iterator;
// import java.util.function.Consumer;

import static net.mindview.util.Print.print;

class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {

    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    @Override
    public Pair<Integer, String> next() {
        return new Pair<Integer, String>(
                number++, "" + letter++
        );
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number < size;
            }

            @Override
            public Integer next() {
                return number++;
            }

            @Override
            public void remove() {

            }
        };
    }
}

public class MapDataTest {
    public static void main(String[] args) {
        print(MapData.map(new Letters(), 11));

        print(MapData.map(new CountingGenerator.Character(), new RandomGenerator.String(3), 8));

        print(MapData.map(new CountingGenerator.Character(), "Value", 6));

        print(MapData.map(new Letters(), new RandomGenerator.String(3)));

        print(MapData.map(new Letters(), "Pop"));
    }
}
