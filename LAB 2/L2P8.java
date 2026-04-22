class Student {
    String name;
    int marks;
    Student(String n, int m) {
        name = n;
        marks = m;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class L2P8 {
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student("Rajan", 67);
        s[1] = new Student("Rohit", 78);
        s[2] = new Student("Ramesh", 56);
        s[3] = new Student("Abhi", 90);
        for( int i = 0; i<s.length; i++) {
            s[i].display();
        }
    }
}