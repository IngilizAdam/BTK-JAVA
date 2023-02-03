import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int nSayisi = keyboard.nextInt();
        keyboard.close();

        int sonuc = 1;
        for(int i = 1; i <= nSayisi; i++){
            sonuc = sonuc * i;
        }

        System.out.println(nSayisi + "! = " + sonuc);
    }
}
