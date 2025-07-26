package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
        Iterator<String> str = list.iterator();
        while(str.hasNext()){
            String value = str.next();
            if(value.equals("B")){
                str.remove();
            }
            System.out.println(value);
        }
        System.out.println(list);
    }
}
