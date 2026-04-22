class Message{
    String text;
    Message(String t){
        text = t;
    }
    void showLength(){
        System.out.println("Length of message: " + text.length());
    }
    void showUpperCase(){
        System.out.println("Message in uppercase: " + text.toUpperCase());
    }
}
public class L2P7 {
    public static void main(String[] args) {
        Message m = new Message("JaVa prOgramMing");
        m.showLength();
        m.showUpperCase();
    }
}
