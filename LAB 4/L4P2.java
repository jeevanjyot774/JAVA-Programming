class bankAccount{
    private double balance;
    bankAccount(double b){
        balance=b;
    }
    protected void withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Current balance: " + balance);
        } 
    }
    void checkBalance(){
        System.out.println("Current balance: " + balance);
    }
}
class User extends bankAccount {
    User(double b) {
        super(b);
    }

    void makeWithdrawal(double amount) {
        withdraw(amount);
    }
}

class premiumAccount extends User {
    premiumAccount(double b) {
        super(b);
    }
}
public class L4P2 {
    public static void main(String[] args){
        User u = new User(1000);
        u.checkBalance();
        u.makeWithdrawal(200);
        u.checkBalance();
        premiumAccount p = new premiumAccount(2000);
        p.checkBalance();
    }
}
