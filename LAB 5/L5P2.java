public class L5P2 {
    public static void main(String[] args){
        int[] arr = new int[5];
        try{
            int n = arr[6];
            System.out.println("Result: " + arr);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bounds!");
        }
    }
}
