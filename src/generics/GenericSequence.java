package generics;

import java.util.ArrayList;
import java.util.List;

import static net.mindview.util.Print.printnb;

interface Selector<T> {
    boolean end();

    T current();

    void next();
}

public class GenericSequence<T> {
    private List<T> items;
    private int next = 0;

    public GenericSequence(int size) {
        items = new ArrayList<>(size);
    }

    public void add(T x) {
        items.add(x);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public T current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if (i < items.size())
                i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        GenericSequence<Integer> sequence = new GenericSequence(10);
        Selector selector = sequence.selector();

        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }

        while (!selector.end()) {
            printnb(selector.current() + " ");
            selector.next();
        }
    }
}
