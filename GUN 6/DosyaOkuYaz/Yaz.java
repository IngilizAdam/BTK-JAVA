import java.io.FileOutputStream;
import java.io.PrintStream;

public class Yaz {
    public static void main(String[] args) {
        try{
            PrintStream out = new PrintStream(new FileOutputStream("yaz.txt"));
            out.println("Dosyaya yazdim");
            out.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
