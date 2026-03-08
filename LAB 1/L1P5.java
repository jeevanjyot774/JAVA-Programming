import java.util.*;
public class L1P5 {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int max=Collections.max(numbers);
        int min= Collections.min(numbers);
        System.out.println(max);
        System.out.println(min);
    }
}
