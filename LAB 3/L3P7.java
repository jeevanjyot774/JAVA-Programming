class Student{
    String name;
    int marks;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }
}
class Result extends Student{
    String grade;
    void display(){
        super.display();
        System.out.println("Grade: "+grade);
    }
}
public class L3P7 {
    public static void main(String[] args){
        Result r = new Result();
        r.name = "Emiliano";
        r.marks = 85;
        r.grade = "A";
        r.display();
    }
}
