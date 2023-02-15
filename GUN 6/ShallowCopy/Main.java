public class Main {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        System.out.println(araba1.getTekerlekSayisi());
        araba1.setBenzinli(true);
        araba1.setDortCeker(false);
        araba1.setOtomatik(false);
        araba1.setRenk("Kirmizi");
        System.out.println(araba1);
        Araba araba2 = araba1;
        araba2.setRenk("Pembe");
        System.out.println("Araba1 Rengi: " + araba1.getRenk());
        System.out.println("Araba2 Rengi: " + araba2.getRenk());
    }
}
