package CollectionFramework;
import java.util.*;
public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
        ListIterator<String> itr = list.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
