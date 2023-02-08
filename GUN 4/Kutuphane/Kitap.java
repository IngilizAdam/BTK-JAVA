public class Kitap{
    private String isim;
    private String yazar;
    private int basimYili;
    private int sayfaSayisi;

    private boolean kitapStokta;

    public Kitap(String isim, String yazar, int basimYili, int sayfaSayisi){
        this.isim = isim;
        this.yazar = yazar;
        this.basimYili = basimYili;
        this.sayfaSayisi = sayfaSayisi;

        kitapStokta = true; // this.kitapStokta = true; ayni sey
    }

    public boolean kitapStoktaMi(){
        /*
        if(kitapStokta){
            return true;
        } else{
            return false;
        }
        */

        // yukaridakiyle ayni anlama geliyor:
        return kitapStokta;
    }

    public boolean kitabiAl(){
        if(this.kitapStokta){
            kitapStokta = false;
            return true;
        }
        else{ // else koymasak da ayni sey olurdu, direkt return false; yazabilirdik
            return false;
        }
    }

    public void kitapVer(){
        kitapStokta = true;
    }

    public void print(){
        System.out.println(this.isim + ", " + yazar + ", " + this.basimYili + ", " + sayfaSayisi);
    }
}