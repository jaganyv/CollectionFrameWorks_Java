package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.addFirst("Jagan");
        dq.addLast("Yadav");
        System.out.println(dq);
//        dq.removeFirst();
//        dq.removeLast();
//        System.out.println(dq);
        dq.peekFirst();
        dq.peekLast();
        System.out.println(dq);
    }
}
