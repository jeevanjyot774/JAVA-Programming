class Student{
   int rollno;
   String name;
   int[] marks;
   Student(int r, String n, int[] m){
    rollno=r;
    name=n;
    marks = m;
   }
   int average(){
    int sum = 0;
    for(int i=0; i<marks.length;i++){
        sum += marks[i];
    }
    return sum/marks.length;
   }
   void display(){
    System.out.println("Roll No: " + rollno);
    System.out.println("Name: " + name);
    System.out.println("Average Marks: " + average());
}
}
public class L2P5 {
    public static void main(String[] args) {
        int[] m1 = {85, 90, 78, 92, 88};
        Student s1 = new Student(1, "Alice", m1);
        s1.display();
    }
}
