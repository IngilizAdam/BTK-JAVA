public class IkiOdaliEv extends Ev {

    private boolean duvarKagitli;

    public boolean isDuvarKagitli() {
        return duvarKagitli;
    }

    public void setDuvarKagitli(boolean duvarKagitli) {
        this.duvarKagitli = duvarKagitli;
    }

    public IkiOdaliEv(int balkonSayisi, int metrekare, String mutfakTipi, boolean bahceVar, boolean duvarKagitli){
        super(2, balkonSayisi, metrekare, mutfakTipi, bahceVar);
        this.duvarKagitli = duvarKagitli;
    }

    public void setOdaSayisi(int odaSayisi){
        System.out.println("Oda sayisi degistirilemez");
    }

    public String toString(){
        return super.toString() + ", " + duvarKagitli;
    }
}
