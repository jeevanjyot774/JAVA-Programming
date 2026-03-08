
import java.util.*;
public class L1P6 {
    public static void main(String[] args){
        List<String> list= new ArrayList<>();
        list.add("Ball");
        list.add("Helmet");
        list.add("Bat");
        list.add("Gloves");
        list.add("Cap");
        Collections.reverse(list);
        System.out.println(list);
    }
}
