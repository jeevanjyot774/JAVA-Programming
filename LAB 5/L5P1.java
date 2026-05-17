public class L5P1 {
    public static void main(String[] args){
        int a = 8;
        int b = 0;
        try{
            int c = a / b;
            System.out.println("Result: " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Error!");
        }
    }
}
