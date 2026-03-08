 import java.util.*;
public class L1P2 {
    public static void main(String[] args){
        List<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,2,4,2,5));
        int target = 2;
        numbers.removeIf(n-> n==target);
        System.out.println(numbers);
    }
}