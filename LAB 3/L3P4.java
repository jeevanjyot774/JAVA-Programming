class Product{
    String name;
    double price;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}
class Electronics extends Product{
    int warrantyPeriod;
    void display(){
        super.display();
        System.out.println("Warranty Period: "+ warrantyPeriod + " years");
}
public class L3P4 {
    public static void main(String[] args) {
        Electronics e = new Electronics();
        e.name = "Smartphone";
        e.price = 17999.9;
        e.warrantyPeriod = 2;
        e.display();
    }
}
}
