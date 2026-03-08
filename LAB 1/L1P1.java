import java.util.ArrayList;
public class L1P1 {
    public static void main(String[] args){
        ArrayList<String> list= new ArrayList<>();
        list.add("Ball");
        list.add("Bat");
        list.add("Helmet");
        list.add("Gloves");
        list.add("Cap");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
