class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
public class L5P8 {
    public static void CheckWithdraw(double amount, double balance) throws MyException{
        if(amount > balance){
            throw new MyException("Insufficient balance.");
        }
        else{
            balance = balance - amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
    public static void main(String[] args){
        double amount = 5000;
        double balance = 1000;
        try{
            CheckWithdraw(amount, balance);
        }
        catch(MyException e){
              System.out.println(e.getMessage());
        }
    }
}
