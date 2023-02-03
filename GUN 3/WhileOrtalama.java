import java.util.Scanner;

public class WhileOrtalama {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int okunanSayi = klavye.nextInt();

        int toplam = 0;
        int sayiMiktari = 0;
        while(okunanSayi >= 0){
            sayiMiktari++;
            toplam += okunanSayi;
            okunanSayi = klavye.nextInt();
        }

        double ortalama = (toplam * 1.0)/sayiMiktari;
        System.out.println("Ortalama: " + ortalama);
    }
}
