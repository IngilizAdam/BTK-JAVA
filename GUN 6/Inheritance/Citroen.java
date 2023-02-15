public class Citroen extends Araba{
    private boolean hatchback;

    public boolean isHatchback() {
        return hatchback;
    }

    public void setHatchback(boolean hatchback) {
        this.hatchback = hatchback;
    }

    public String toString(){
        return getTekerlekSayisi() + ", " + getRenk() + ", " + getOtomatikMi() + ", " + getBenzinliMi() + ", " + getDortCeker() + ", " + hatchback; 
    }
}
