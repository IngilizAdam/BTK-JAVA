import java.util.Scanner;

public class StringLowerCase {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        String yazi = klavye.nextLine();

        //System.out.println(yazi.length());
        //System.out.println(yazi.toLowerCase());

        String sonuc = "";
        for(int i = 0; i < yazi.length(); i++){
            char karakter = yazi.charAt(i);

            if(karakter >= 65 && karakter <= 90){
                karakter = (char)(karakter + 32);
            }
            else if(karakter >= 97 && karakter <= 122){
                karakter = (char)(karakter - 32);
            }

            sonuc = sonuc + karakter;
        }

        System.out.println(sonuc);
    }
}
