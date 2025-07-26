package PracticeCollectionFrameworks;
import java.util.*;
public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Arrays.asList(12,24,36,48,60));
        Iterator<Integer> itr = pq.iterator();
        while(itr.hasNext()){
            Integer value = pq.poll();
            if(value == pq.poll()){
                System.out.println(value);
            }
        }
        System.out.println(pq);
    }
}
