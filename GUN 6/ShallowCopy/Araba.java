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
    
}
