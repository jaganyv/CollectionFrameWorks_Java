package CollectionFramework;
import java.util.*;
public class MapInterfaceEx {
    public static void main(String[] args) {
        Map<String,Integer> phoneBook = new HashMap<>();
        phoneBook.put("Jagan",94873724);
        phoneBook.put("Nallaiyan",9360406);
        phoneBook.put("Karthikk",298369476);
        phoneBook.put("Sabari",298374);
        System.out.println(phoneBook);

        Map<Integer,String> studentData = new TreeMap<>();
        studentData.put(18,"Jagan");
        studentData.put(20,"Jeba");
        studentData.put(30,"Kerozene");
        studentData.put(40,"Kavin");
        System.out.println(studentData);

        for(Map.Entry<String,Integer> entry : phoneBook.entrySet()){
            System.out.println(entry.getKey()+ "-> "+ entry.getValue());
        }
    }
}
