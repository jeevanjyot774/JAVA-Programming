import java.util.*;
public class L5P3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String s = sc.nextLine();

        try {
            int n = Integer.parseInt(s);
            System.out.println("Enter a number: " + n);
        } catch (NumberFormatException e) {
            System.out.println("Error!");
        }
        sc.close();
    }
}
