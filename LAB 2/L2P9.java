class bankAccount{
    String accountHolderName;
    double balance;
    bankAccount(String name, double bal){
        accountHolderName = name;
        balance = bal;
    }
    void deposit(double amount){
        balance += amount;
    }
    void display(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
public class L2P9 {
    public static void main(String[] args) {
        bankAccount account = new bankAccount("Charlie Kirk", 5000.0);
        account.deposit(1500.0);
        account.display(); 
}
}