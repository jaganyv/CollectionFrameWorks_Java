package PracticeCollectionFrameworks;
import java.util.*;
public class DequePractice {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.addFirst("Jagan Yadav M");
        dq.addLast("Nallaiyan");
        dq.addFirst("Kabilesh");
        dq.addLast("Karthikk");
        System.out.println(dq);
        String lastName = dq.removeLast();
        String firstName = dq.removeFirst();
        System.out.println("LastName: "+lastName);
        System.out.println("FirstName: "+firstName);
        System.out.println("Remaining Deque: "+dq);

    }
}
