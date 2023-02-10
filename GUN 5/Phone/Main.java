public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setSahip("Hasan");
        phone1.setNumara("505 555 55 55");
        phone1.setKontorlu(false);
        phone1.setYurtIci(true);
        System.out.println("Phone 1 sahibi: " + phone1.getSahip());
        System.out.println("Phone 1 numarasi: " + phone1.getNumara());
        System.out.println("Phone 1 kontorlu mu: " + phone1.getKontorlu());
        System.out.println("Phone 1 yurt ici mi: " + phone1.getYurtIci());

        Phone phone2 = new Phone("Ahmet", "+1 123 123 12 13", true, false);
        System.out.println("Phone 2 sahibi: " + phone2.getSahip());
        System.out.println("Phone 2 numarasi: " + phone2.getNumara());
        System.out.println("Phone 2 kontorlu mu: " + phone2.getKontorlu());
        System.out.println("Phone 2 yurt ici mi: " + phone2.getYurtIci());
        
        System.out.println("\nTelefon 1 bilgileri: ");
        phone1.printInfo();

        System.out.println("\nTelefon 2 bilgileri: ");
        phone2.printInfo();

        System.out.println("\nTelefon 1: " + phone1);
        System.out.println("Telefon 2: " + phone2.toString());
    }
}
