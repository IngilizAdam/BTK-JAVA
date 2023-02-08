public class Insan {
    public String isim;
    public String soyisim;
    public int yas;
    public String cinsiyet;

    public Insan(){ // DEFAULT CONSTRUCTOR
        
    }

    public Insan(String isim, String yeniSoyisim, int yeniYas, String cinsiyet){ // CONSTRUCTOR
        this.isim = isim;
        this.soyisim = yeniSoyisim;
        yas = yeniYas;
        this.cinsiyet = cinsiyet;
    }
}
