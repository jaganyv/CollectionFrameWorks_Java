package PracticeCollectionFrameworks;
import java.util.*;
public class MapScoreBoard {
    public static void main(String[] args) {
        Map<String,Integer> scoreCard = new TreeMap<>(Comparator.reverseOrder());
        scoreCard.put("Jagan",11);
        scoreCard.put("Leo Messi",10);
        scoreCard.put("Virat Kholi",18);
        scoreCard.put("Cristiano Ronaldo",7);
        scoreCard.put("Dhoni",7);
        System.out.println(scoreCard);
    }
}
