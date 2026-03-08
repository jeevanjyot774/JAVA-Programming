import java.util.*;
public class L1P7 {
    public static void main(String[] args) {
         List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
    }
}
