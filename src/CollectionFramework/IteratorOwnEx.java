package CollectionFramework;
import java.util.*;
import java.util.ArrayList;

public class IteratorOwnEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
        Iterator<String> str1 = list.iterator();
        while(str1.hasNext()) {
            String value = str1.next();
            if (value.equals("C")) {
                str1.remove();
            }
            System.out.println(value);
        }
        System.out.println(list);
    }

}
