import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("Kac tane sayi gireceksiniz?");
        int sayiAdeti = klavye.nextInt();

        int toplam = 0;
        for(int i = 0; i < sayiAdeti; i++){
            int okunanSayi = klavye.nextInt();
            if(okunanSayi >= 0 && okunanSayi <= 100){
                toplam += okunanSayi;
            } else{
                i = i-1;
            }
        }

        System.out.println("Ortalama = " + (toplam / (sayiAdeti * 1.0)));
    }
}
