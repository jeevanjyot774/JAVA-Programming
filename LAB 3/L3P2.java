class Employee{
    String name;
    double baseSalary;
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Base Salary: "+ baseSalary);
    }
}
class Manager extends Employee{
    double bonus;
    void display(){
        super.display();
        System.out.println("Bonus: "+ bonus);
    }
    void totalSalary(){
        double total = baseSalary + bonus;
        System.out.println("Total Salary: "+ total);
    }
}
    public class L3P2 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Michael";
        m.baseSalary = 67000.47;
        m.bonus = 1500.50;
        m.display();
        m.totalSalary();
    }
}
