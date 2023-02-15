public class BMW extends Araba{
    private String paket;

    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    @Override
    public String toString(){
        return getTekerlekSayisi() + ", " + getRenk() + ", " + getOtomatikMi() + ", " + getBenzinliMi() + ", " + getDortCeker() + ", " + paket;
    }
}
