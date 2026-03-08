import java.util.*;
public class L1P9 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        list1.retainAll(list2);

        System.out.println(list1);
    }
}

