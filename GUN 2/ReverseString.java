import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        String yazi = klavye.nextLine();

        int uzunluk = yazi.length();
        System.out.println(uzunluk);

        // hasan
        // 01234
        
        // YONTEM 1
        String sonuc = "";
        /*for(int i = 0; i < uzunluk; i++){
            sonuc = yazi.charAt(i) + sonuc;
        }*/


        // YONTEM 2
        for(int i = uzunluk-1; i >= 0; i--){
            sonuc = sonuc + yazi.charAt(i);
        }

        System.out.println(sonuc);
    }
}
