public class BirBalkonlu extends IkiOdaliEv {

    private boolean kaloriferli;

    public boolean isKaloriferli() {
        return kaloriferli;
    }

    public void setKaloriferli(boolean kaloriferli) {
        this.kaloriferli = kaloriferli;
    }

    public BirBalkonlu(int metrekare, String mutfakTipi, boolean bahceVar, boolean duvarKagitli, boolean kaloriferli){
        super(1, metrekare, mutfakTipi, bahceVar, duvarKagitli);
        this.kaloriferli = kaloriferli;
    }

    public String toString(){
        return super.toString() + ", " + kaloriferli;
    }
}
