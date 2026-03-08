import java.util.*;
public class L1P8 {
    public static void main(String[] args) {
        List<String> words= new ArrayList<>();
        words.add("Ball");
        words.add("Helmet");
        words.add("Bal");
        words.add("Gloves");
        words.add("Gloves");
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println(map);
}
}