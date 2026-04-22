class Car{
    String brand;
    double price;

    Car(String brand, double price){
        this.brand = brand;
        this.price = price;
    }
    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
public class L2P6 {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 25000.0);
        c1.display();
    }
}
