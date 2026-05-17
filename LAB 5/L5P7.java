class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
public class L5P7 {
    public static void CheckAge(int age) throws MyException{
        if(age < 18){
            throw new MyException("Not Eligible.");
        }
        else{
            System.out.println("Eligible.");
        }
    }
    public static void main(String[] args){
        int age = 7;
        try{
            CheckAge(age);
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
