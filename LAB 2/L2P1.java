class Student{
int rollno;
String name;
Student(int r, String n){
    rollno=r;
    name=n;
}
void display(){
    System.out.println("Roll No: " + rollno);
    System.out.println("Name: " + name);
}
}
public class L2P1 {
    public static void main(String[] args) {
        Student s = new Student(1, "Ram");
        s.display();
    }
}
