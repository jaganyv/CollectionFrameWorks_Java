package CollectionFramework;
import java.util.*;
public class ListIteratorOwnEx {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("M","L","K"));
        ListIterator<String> itr1 = list1.listIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        while(itr1.hasPrevious()){
            System.out.println(itr1.previous());
        }
    }
}
