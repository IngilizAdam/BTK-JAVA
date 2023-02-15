public class DS extends Citroen {
    private String farTipi;

    public String getFarTipi() {
        return farTipi;
    }

    public void setFarTipi(String farTipi) {
        this.farTipi = farTipi;
    }

    public String toString(){
        return super.toString() + ", " + farTipi;
    }

}
