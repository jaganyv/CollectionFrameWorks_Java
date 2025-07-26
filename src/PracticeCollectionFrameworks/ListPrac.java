package PracticeCollectionFrameworks;
import java.util.*;
public class ListPrac {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            Integer value = itr.next();
            if(value % 2 == 0){
                System.out.println(value);
            }
        }
    }
}
