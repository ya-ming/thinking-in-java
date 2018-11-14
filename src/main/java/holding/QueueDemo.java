package holding;

import java.util.*;

import static net.mindview.util.Print.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++)
            queue.offer(rand.nextInt(i + 10));

        while (queue.peek() != null) {
            printnb(queue.remove() + " ");
        }
        print();
        print(queue);

        Queue<Character> qc = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray())
            qc.offer(c);
        print(qc);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextInt(i + 10));
        }
        print(priorityQueue);
        while (priorityQueue.peek() != null) {
            printnb(priorityQueue.remove() + " ");
        }
        print();
    }
}
