class Person{
    String name;
    int age;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Patient extends Person{
    String disease;
    String doctorAssigned;
    void display(){
        super.display();
        System.out.println("Disease: "+disease);
        System.out.println("Doctor Assigned: "+doctorAssigned);
    }
}

public class L3P6 {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.name = "Aditya";
        p.age = 30;
        p.disease = "Flu";
        p.doctorAssigned = "Dr. Ankit";
        p.display();
    }
}
