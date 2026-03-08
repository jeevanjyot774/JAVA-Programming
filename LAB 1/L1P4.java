import java.util.*;
public class L1P4 {
    public static void main(String[] args){
        Integer[] a={1,2,3,4,5};
        List<Integer> list = Arrays.asList(a);
        System.out.println(list);
        Integer[] l=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(l));
    }
 }