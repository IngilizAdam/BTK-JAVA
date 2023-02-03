import java.util.Scanner;

public class ESayisi{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int nSayisi = keyboard.nextInt();
        keyboard.close();

        double eSayisi = 1;
        int factorial = 1;
        for(int i = 1; i <= nSayisi; i++){
            factorial *= i;
            /*
             * i = 1 => factorial = 1  (1!)
             * i = 2 => factorial = 2  (2!)
             * i = 3 => factorial = 6  (3!)
             * i = 4 => factorial = 24 (4!)
             */

            eSayisi = eSayisi + (1.0/factorial);
        }

        System.out.println("e sayisi = " + eSayisi);
    }
}
