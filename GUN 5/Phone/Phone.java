public class Phone{
    private String sahip;
    private String numara;
    private boolean kontorlu; // true ise kontorlu; false ise faturali
    private boolean yurtIci; // true ise yurtici; false ise yurtdisi

    public Phone(){
        System.out.println("Obje olusturuldu");
    }

    public Phone(String sahip, String numara, boolean kontorlu, boolean yurtIci){
        System.out.println("Obje olusturuldu");
        this.sahip = sahip;
        this.numara = numara;
        this.kontorlu = kontorlu;
        this.yurtIci = yurtIci;
    }

    public void setSahip(String sahip){
        this.sahip = sahip;
    }

    public String getSahip(){
        return sahip; // = return this.sahip;
    }

    public void setNumara(String numara){
        this.numara = numara;
    }

    public String getNumara(){
        return this.numara; // = return numara;
    }

    public void setKontorlu(boolean parametre){
        kontorlu = parametre; // = this.kontorlu = parametre;
    }

    public boolean getKontorlu(){
        return kontorlu;
    }

    public void setYurtIci(boolean yurtIci){
        this.yurtIci = yurtIci;
    }

    public boolean getYurtIci(){
        return yurtIci;
    }

    public void printInfo(){
        System.out.println("Telefon sahibi: " + this.sahip);
        System.out.println("Telefon numarasi: " + numara);
        System.out.println("Telefon kontorlu mu: " + this.kontorlu);
        System.out.println("Telefon yurt ici mi: " + yurtIci);
    }

    public String toString(){
        return sahip + ", " + numara + ", " + kontorlu + ", " + yurtIci;
    }
}