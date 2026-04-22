class Employee{
    String name, designation;
    float salary;
    Employee(String n, String d, float s){
        name=n;
        designation=d;
        salary=s;
    }
    void display(){
       System.out.println("Name: " +name );
       System.out.println("Designation: " +designation);
       System.out.println("Salary: " +salary);
    }
}
public class L2P3 {
    public static void main(String[] args){
        Employee e = new Employee("John", "HR", 70000.8f);
        e.display();
    }
}
