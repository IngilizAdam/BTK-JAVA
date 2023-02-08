public class Hesap {
    private Insan hesapSahibi;

    private int bakiye;

    public void setHesapSahibi(Insan yeniHesapSahibi){
        hesapSahibi = yeniHesapSahibi;
    }

    public String getHesapSahibininAdi(){
        return hesapSahibi.isim;
    }

    public Insan getHesapSahibi(){
        return hesapSahibi;
    }

    public int getBakiye(){
        return bakiye;
    }

    public void setBakiye(int yeniBakiye){
        bakiye = yeniBakiye;
    }

    public void paraGonder(Hesap gonderilecekHesap, int gonderilecekMiktar){
        System.out.println("Gonderme oncesi Hesap1 Bakiye: " + this.bakiye);
        System.out.println("Gonderme oncesi Hesap2 Bakiye: " + gonderilecekHesap.bakiye);
        gonderilecekHesap.bakiye += gonderilecekMiktar;
        this.bakiye -= gonderilecekMiktar;
    }

    public void paraYetiyorsaGonder(Hesap gonderilecekHesap, int gonderilecekMiktar){
        System.out.println("Gonderme oncesi Hesap1 Bakiye: " + this.bakiye);
        System.out.println("Gonderme oncesi Hesap2 Bakiye: " + gonderilecekHesap.bakiye);
        if(this.bakiye >= gonderilecekMiktar){
            gonderilecekHesap.bakiye += gonderilecekMiktar;
            this.bakiye -= gonderilecekMiktar;
        } else{
            System.out.println("Bakiye yetersiz");
        }
    }
}
