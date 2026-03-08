import java.util.ArrayList;
public class L1P3 {
    public static void main(String[] args){
          ArrayList<String> list= new ArrayList<>();
        list.add("Ball");
        list.add("Helmet");
        list.add("Bat");
        list.add("Gloves");
        list.add("Cap");
        String target="Bat";
        if(list.contains(target)){
            System.out.println("Target Found!");
        }
        else{
            System.out.println("Not Found!");
        }
    }
}
