package CollectionFramework;
import java.util.*;
public class MapInterface {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Jagan",18);
        hashMap.put("Yadav",07);
        hashMap.get("Jagan");
        hashMap.remove("Jagan");
        hashMap.containsKey("J");
        hashMap.containsValue(18);
        hashMap.values();
        hashMap.keySet();
        hashMap.entrySet();
        System.out.println(hashMap);

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(18,"Jagan");
        linkedHashMap.put(20,"Yadav");
        System.out.println(linkedHashMap);

        Map<String,Integer> treeHashMap = new TreeMap<>();
        treeHashMap.put("Jagan Yadav M",18);
        treeHashMap.put("Appu",07);
        System.out.println(treeHashMap);
    }
}
