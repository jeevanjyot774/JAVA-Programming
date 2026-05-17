import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    double marks;
    ArrayList<Student> list = new ArrayList<>();

    public Student() {}

    public Student(int id, String name, String course, double marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    void addStudent(Scanner scanner) {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        list.add(new Student(id, name, course, marks));
        System.out.println("Student added successfully!");
    }

    void viewStudents() {
        if (list.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\n--- Student Records ---");
        for (Student s : list) {
            System.out.println("ID: " + s.id + " | Name: " + s.name + " | Course: " + s.course + " | Marks: " + s.marks);
        }
    }

    void updateStudent(Scanner scanner) {
        System.out.print("Enter ID of student to update: ");
        int id = scanner.nextInt();
        for (Student s : list) {
            if (s.id == id) {
                scanner.nextLine();
                System.out.print("Enter new Name: ");
                s.name = scanner.nextLine();
                System.out.print("Enter new Course: ");
                s.course = scanner.nextLine();
                System.out.print("Enter new Marks: ");
                s.marks = scanner.nextDouble();
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    void deleteStudent(Scanner scanner) {
        System.out.print("Enter ID of student to delete: ");
        int id = scanner.nextInt();
        for (Student s : list) {
            if (s.id == id) {
                list.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    student.addStudent(scanner);
                    break;
                case 2:
                    student.viewStudents();
                    break;
                case 3:
                    student.updateStudent(scanner);
                    break;
                case 4:
                    student.deleteStudent(scanner);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }
}
