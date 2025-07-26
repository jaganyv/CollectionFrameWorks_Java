package CollectionFramework;
import java.util.*;
public class ArraySet {
    public static void main(String[] args) {
      Set<String> hashSet = new HashSet<>();
      hashSet.add("Apple");
      hashSet.add("Mango");
      hashSet.add("Banana");
      hashSet.add("Tomato");
      System.out.println("HashSet: " + hashSet);

      Set<String> linkedHashSet = new LinkedHashSet<>();
      linkedHashSet.add("Apple");
      linkedHashSet.add("Mango");
      linkedHashSet.add("Banana");
      linkedHashSet.add("Tomato");
        System.out.println("Linked HashSet: " + linkedHashSet);

      Set<Integer> treeSet = new TreeSet<>();
      treeSet.add(10);
      treeSet.add(60);
      treeSet.add(80);
      treeSet.add(90);
      treeSet.add(30);
        System.out.println("TreeSet: " + treeSet);
    }
}
