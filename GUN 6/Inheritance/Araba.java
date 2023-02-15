public class Araba{
    private int tekerlekSayisi = 4;
    private String renk;
    private boolean otomatik; // true = otomatik; false = manuel
    private boolean benzinli; // true = benzinli; false = dizel
    private boolean dortCeker; // true = dortCeker; false = ikiCeker

    public boolean getDortCeker() {
        return dortCeker;
    }

    public void setDortCeker(boolean dortCeker) {
        this.dortCeker = dortCeker;
    }

    public int getTekerlekSayisi(){
        return tekerlekSayisi;
    }

    public void setRenk(String renk){
        this.renk = renk;
    }

    public String getRenk(){
        return this.renk;
    }

    public void setOtomatik(boolean deger){
        otomatik = deger;
    }

    public boolean getOtomatikMi(){
        return otomatik;
    }

    public void setBenzinli(boolean benzinli){
        this.benzinli = benzinli;
    }

    public boolean getBenzinliMi(){
        return benzinli;
    }

    @Override
    public String toString(){
        return tekerlekSayisi + ", " + renk + ", " + otomatik + ", " + benzinli + ", " + dortCeker;
    }
    
    public static void arabaMi(Araba araba){
        System.out.println("Bu bir araba");
    }

    public static boolean mercedesMi(Araba araba){
        if(araba instanceof Mercedes){
            return true;
        }
        return false;
    }

    public static boolean citroenMi(Araba araba){
        return (araba instanceof Citroen);
    }

    public static String getFarTipi(Araba araba){
        if(araba instanceof DS){
            DS ds = (DS)araba;
            return ds.getFarTipi();
        }
        else {
            return "DS degil";
        }
    }
}
