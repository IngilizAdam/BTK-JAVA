import java.util.Scanner; // Scanner objesi olusturmak icin once import etmek gerekir.

public class InputAlma {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Bu satir bir Scanner objesi olusturur.
        
        String yazi = keyboard.nextLine(); // nextLine() metodu ile terminale girilen tum yazi alinir (enter'a basilincaya kadar girilen her sey)
        String kelime = keyboard.next(); // next() metodu ile terminale girilen ifade ilk bosluga kadar alinir
        int tamSayi = keyboard.nextInt(); // nextInt() metodu ile tam sayi input alinir
        double virgulluSayi = keyboard.nextDouble(); // nextDouble() metodu ile virgullu sayi input alinir (virgul yerine nokta kullanilir) 
    
        // olusturdugumuz Scanner objesi ile isimiz bittigi zaman baglantiyi kapatmamiz iyi olacaktır
        // yapmazsak da program calisir
        keyboard.close(); // kurulan baglantiyi kapatma metodu

        System.out.println(yazi);
        System.out.println(kelime);
        System.out.println(tamSayi);
        System.out.println(virgulluSayi);
    }
}
