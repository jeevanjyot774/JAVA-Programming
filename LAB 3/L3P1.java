class Person{
    String name;
    int age;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Student extends Person{
    int rollNo;
    String course;
    void display(){
        super.display();
        System.out.println("Roll No: "+rollNo);
        System.out.println("Course: "+course);
    }
}
public class L3P1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Jack";
        s.age = 20;
        s.rollNo = 10;
        s.course = "Java Programming";
        s.display();
}
}