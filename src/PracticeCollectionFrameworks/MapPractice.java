package PracticeCollectionFrameworks;
import java.util.*;
public class MapPractice {
    public static void main(String[] args) {
        Map<String,Integer> phoneBook = new HashMap<>();
        phoneBook.put("Jagan",94873724);
        phoneBook.put("Leo Messi",9384724);
        phoneBook.put("Cristiano",9082377);
        System.out.println(phoneBook.keySet());
        System.out.println(phoneBook.values());
    }
}
