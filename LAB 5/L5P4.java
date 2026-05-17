import java.util.*;
public class L5P4 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         try {
            System.out.println("Enter first number: ");
            String i1 = sc.nextLine();
            System.out.println("Enter second number: ");
            String i2 = sc.nextLine();
            int n1 = Integer.parseInt(i1);
            int n2 = Integer.parseInt(i2);
            int n = n1 / n2;
            System.out.println("Result: " + n);
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error!");
        }
        sc.close();
    }
}
