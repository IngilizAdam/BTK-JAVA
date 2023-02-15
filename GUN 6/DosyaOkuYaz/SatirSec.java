import java.io.FileInputStream;
import java.util.Scanner;

public class SatirSec {
    public static void main(String[] args) {
        try {
            String dosyaAdi = "okuyaz.txt";
            Scanner in = new Scanner(new FileInputStream(dosyaAdi));
            String dosyaIcerigi = "";
            while (in.hasNextLine()) {
                dosyaIcerigi += in.nextLine() + "\n";
            }
            in.close();

            String array[] = dosyaIcerigi.split("\n");
            System.out.println(array[2] + "\n" + array[3]);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
