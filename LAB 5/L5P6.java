public class L5P6 {
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error!");
        } 
        finally {
            System.out.println("Finally block executed.");
        }
    }
}
