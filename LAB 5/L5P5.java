import java.io.*;
import java.util.*;
public class L5P5 {
    public static void main(String[] args){
        try{
            File f = new File("test.text");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(IOException e){
            System.out.println("Error! File not found.");
        }
        finally{
            System.out.println("Program completed.");
        }
    }
}
