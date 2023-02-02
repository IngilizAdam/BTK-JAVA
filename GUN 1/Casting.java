public class Casting {
    public static void main(String[] args) {
        double virgullu = 5.7;
        System.out.println(virgullu);

        /*
        Cast islemi (donusecek tip)(donusecek nesne) seklinde yapilir.
        Buradaki donusecek nesne 'yi kapsayan parantez opsiyoneldir ancak karisikligi onler.
        */
        int tamSayi = (int)(virgullu); // double -> int cast islemi virgulden sonrasini siler.
        System.out.println(tamSayi);

        // int -> double islemi icin cast etmeye gerek yoktur, otomatik sonuna .0 eklenerek cevrilir
        double yeniVirgullu = tamSayi; // tamSayi yerine (double)tamSayi yazsak da ayni sey olurdu
        System.out.println(yeniVirgullu);
    }
}
