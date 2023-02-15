import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class OkuYaz {
    public static void main(String[] args) {
        try{
            String dosyaAdi = "okuyaz.txt";
            Scanner in = new Scanner(new FileInputStream(dosyaAdi));
            String dosyaIcerigi = "";
            while(in.hasNextLine()){
                dosyaIcerigi += in.nextLine() + "\n";
            }
            dosyaIcerigi += "Okundu/Yazildi";
            in.close();

            PrintStream out = new PrintStream(new FileOutputStream(dosyaAdi));
            out.println(dosyaIcerigi);
            out.close();

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
