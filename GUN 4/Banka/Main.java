public class Main{
    public static void main(String[] args) {
        //System.out.println(Hesap.bakiye); // static olmadigi icin bu sekilde erisilemez
        Hesap hesap1 = new Hesap();
        System.out.println(hesap1.getBakiye()); // public olsaydi hesap1.bakiye yazabilirdik
        Hesap hesap2 = new Hesap();
        System.out.println(hesap2.getBakiye());

        System.out.println("Hesap 1 bakiyesi guncelleniyor...");
        // hesap1.bakiye = 100; public olmadigi icin bunu yapamiyoruz
        hesap1.setBakiye(100);
        System.out.println(hesap1.getBakiye());
        System.out.println(hesap2.getBakiye());

        System.out.println("Hesap 1 sahibi: " + hesap1.getHesapSahibi());

        System.out.println("Hesap 1 sahibi olusturuluyor...");

        Insan hesap1Sahibi = new Insan();
        hesap1Sahibi.isim = "Ada";
        hesap1Sahibi.soyisim = "Karadasli";
        hesap1Sahibi.yas = 20;
        hesap1Sahibi.cinsiyet = "Kadin";
        //hesap1.hesapSahibi = hesap1Sahibi; //instance variable'lar public yapilmamali, ulasirken metot kullanilmali
        hesap1.setHesapSahibi(hesap1Sahibi);
        System.out.println("Hesap 1 sahibinin ismi: " + hesap1.getHesapSahibininAdi());

        System.out.println("Hesap 1 para gonderiyor...");
        hesap1.paraGonder(hesap2, 80);
        System.out.println("Hesap 1 Bakiye: " + hesap1.getBakiye());
        System.out.println("Hesap 2 Bakiye: " + hesap2.getBakiye());

        hesap1.paraYetiyorsaGonder(hesap2, 100);
        System.out.println("Hesap 1 Bakiye: " + hesap1.getBakiye());
        System.out.println("Hesap 2 Bakiye: " + hesap2.getBakiye());

        Insan hesap3Sahibi = new Insan("Hasan", "Tuna", 20, "Erkek");
        System.out.println("Hesap 3 Sahibinin adi: " + hesap3Sahibi.isim);
    }
}