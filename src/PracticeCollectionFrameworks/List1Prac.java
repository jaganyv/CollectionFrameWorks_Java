package PracticeCollectionFrameworks;
import java.util.*;
public class List1Prac {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A","B","C","D"));
        Collections.reverse(list1);
        System.out.println(list1);
    }
}
