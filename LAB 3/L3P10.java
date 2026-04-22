class Recharge{
    int mobileNumber;
    double planAmount;
    void display(){
        System.out.println("Mobile No.: " + mobileNumber);
        System.out.println("planAmount: Rs. " + planAmount);
    }
}
class DataRecharge extends Recharge{
    double dataLimit;
    void display(){
        super.display();
        System.out.println("Data Limit: " + dataLimit + " GB");
    }
}
public class L3P10 {
    public static void main(String[] args){
        DataRecharge dr = new DataRecharge();
        dr.mobileNumber = 98588091;
        dr.planAmount = 399.99;
        dr.dataLimit = 1.5;
        dr.display();
    }
}
