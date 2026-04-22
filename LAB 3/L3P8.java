class Order{
    int orderId;
    double amount;
    void display(){
        System.out.println("Order ID: "+orderId);
        System.out.println("Amount: "+amount);
    }
}
class onlineOrder extends Order{
    double deliveryCharge;
    void display(){
        super.display();
        System.out.println("Delivery Charge: "+ deliveryCharge);
    }
    void total(){
        double totalAmount = amount + deliveryCharge;
        System.out.println("Total Amount: "+ totalAmount);
    }
}
public class L3P8 {
    public static void main(String[] args){
        onlineOrder o = new onlineOrder();
        o.orderId = 11;
        o.amount = 100.94;
        o.deliveryCharge = 50.0;
        o.display();
        o.total();
    }
}
