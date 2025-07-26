package CollectionFramework;
import java.util.PriorityQueue;
import java.util.*;
public class QueueExample{
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        System.out.println("Queue: " + pq);
        System.out.println("Peeked Queue: " + pq.peek());
        pq.poll();
        System.out.println("After Poll: " + pq);

    }
}
