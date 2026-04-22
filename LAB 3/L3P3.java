class Vehicle{
    int vehicleNo;
    String ownerName;
    Vehicle(int v, String o){
        vehicleNo = v;
        ownerName = o;
    }
    void display(){
        System.out.println("Vehicle No: "+ vehicleNo);
        System.out.println("Owner Name: "+ ownerName);
    }
}
class Car extends Vehicle{
    String model;
    String feulType;
    Car(int v, String o, String m, String f){
        super(v,o);
        model = m;
        feulType = f;
    }
    void display(){
        super.display();
        System.out.println("Model: "+ model);
        System.out.println("Feul Type: "+ feulType);
    }
}
public class L3P3 {
    public static void main(String[] args) {
        Car c = new Car(6767, "Daniel", "G Wagon", "Petrol");
        c.display();
    }
}