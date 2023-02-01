import java.util.Scanner;

public class AsciiLower {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        String yazi = klavye.nextLine();
        char karakter = yazi.charAt(0);
        karakter = (char)(karakter + 32);
        System.out.println(karakter);


        // Bir diger yol

        char karakter2 = (char)klavye.nextInt();
        karakter2 = (char)(karakter2 + 32);
        System.out.println(karakter2);
    }
}
