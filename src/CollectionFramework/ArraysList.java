package CollectionFramework;
import java.util.*;
public class ArraysList {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("python");
        languages.add("Java");
        languages.add("C++");
        System.out.println(languages);
        languages.set(1,"JavaScript");
        System.out.println(languages);
    }

}
