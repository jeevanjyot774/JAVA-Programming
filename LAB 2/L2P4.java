class Book{
    String title;
    float price;
    Book(){
        title = "Unknown";
        price = 0.0f;
    }
    Book(String t, float p){
        title = t;
        price = p;
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}
public class L2P4 {
    public static void main(String[] args) {
        Book b1= new Book();
        Book b = new Book("Nani and chor", 499.99f);
        b1.display();
        b.display();
    }
}
