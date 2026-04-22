class Book{
    String title;
    String author;
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
}
class IssuedBook extends Book{
    String issueDate;
    String returnDate;
    void display(){
        super.display();
        System.out.println("Issue Date: "+issueDate);
        System.out.println("Return Date: "+returnDate);
    }
}
public class L3P9 {
 public static void main(String[] args) {
        IssuedBook i = new IssuedBook(); 
        i.title = "One Piece";
        i.author = "Eiichiro Oda";
        i.issueDate = "2024-06-01";
        i.returnDate = "2024-06-15";
        i.display();  
    }
}
