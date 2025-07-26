package CollectionFramework;
import java.util.*;
import java.util.List;

public class CollectionsUtilityExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,21,1,34,3,24,2,2332,1,1,11,1,1,1,1,1,1));
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.unmodifiableList(list));
    }
}
