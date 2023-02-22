public class Ev{
    private int odaSayisi;
    private int balkonSayisi;
    private int metrekare;
    private String mutfakTipi;
    private boolean bahceVar;

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getBalkonSayisi() {
        return balkonSayisi;
    }

    public void setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
    }

    public int getMetrekare() {
        return metrekare;
    }

    private void setMetrekare(int metrekare) {
        this.metrekare = metrekare;
    }

    public String getMutfakTipi() {
        return mutfakTipi;
    }

    public void setMutfakTipi(String mutfakTipi) {
        this.mutfakTipi = mutfakTipi;
    }

    public boolean isBahceVar() {
        return bahceVar;
    }

    public void setBahceVar(boolean bahceVar) {
        this.bahceVar = bahceVar;
    }
    
    public Ev(int odaSayisi, int balkonSayisi, int metrekare, String mutfakTipi, boolean bahceVar) {
        this.odaSayisi = odaSayisi;
        this.balkonSayisi = balkonSayisi;
        this.metrekare = metrekare;
        this.mutfakTipi = mutfakTipi;
        this.bahceVar = bahceVar;
    }

    public String toString(){
        return odaSayisi + ", " + balkonSayisi + ", " + metrekare + ", " + mutfakTipi + ", " + bahceVar;
    }
}
