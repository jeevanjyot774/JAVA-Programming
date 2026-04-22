class Account{
    int accountNumber;
    double balance;
    Account(int a, double b){
        accountNumber = a;
        balance = b;
    }
    void display(){
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Balance: "+ balance);
    }
}
class SavingsAccount extends Account{
    double interestRate;
    SavingsAccount(int a, double b, double i){
        super(a,b);
        interestRate = i;
    }
    void interest(){
        double interestAmount = balance * (interestRate/100);
        System.out.println("Interest Amount: "+ interestAmount);
    }
    void display(){
        super.display();
        System.out.println("Interest Rate: "+ interestRate + "%");
    }
}
public class L3P5 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, 10000, 5);
        s.display();
        s.interest();
    }
}
