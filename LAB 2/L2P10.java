class Sentence {
    String text;
    Sentence(String text) {
        this.text = text;
    }
    int countWords() {
        String[] words = text.split(" "); // split by spaces
        return words.length;    }
}
public class L2P10 {
    public static void main(String[] args) {
        Sentence s = new Sentence("Java is an object oriented language");
        System.out.println("Total words: " + s.countWords());
    }
}