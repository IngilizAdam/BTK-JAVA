public class Main {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        System.out.println(araba1.getTekerlekSayisi());
        araba1.setBenzinli(true);
        araba1.setDortCeker(false);
        araba1.setOtomatik(false);
        araba1.setRenk("Kirmizi");
        System.out.println(araba1);

        BMW bmw1 = new BMW();
        System.out.println(bmw1.getTekerlekSayisi());
        bmw1.setBenzinli(false);
        bmw1.setDortCeker(true);
        bmw1.setOtomatik(false);
        bmw1.setRenk("Beyaz");
        bmw1.setPaket("FULL");
        //araba1.setPaket("sdafdgd");
        System.out.println(bmw1);

        Mercedes mercedes1 = new Mercedes();
        mercedes1.setYil(2000);
        System.out.println(mercedes1.getYil());    
        
        Citroen citroen1 = new Citroen();
        citroen1.setBenzinli(false);
        citroen1.setDortCeker(true);
        citroen1.setOtomatik(false);
        citroen1.setRenk("Mavi");
        citroen1.setHatchback(true);
        System.out.println(citroen1);

        DS ds1 = new DS();
        ds1.setFarTipi("kristal");
        ds1.setHatchback(false);
        ds1.setBenzinli(false);
        ds1.setDortCeker(true);
        ds1.setOtomatik(false);
        ds1.setRenk("Mavi");
        System.out.println(ds1);

        Araba.arabaMi(ds1);
        Araba.arabaMi(mercedes1);

        System.out.println(Araba.mercedesMi(mercedes1));
        System.out.println(Araba.citroenMi(mercedes1));
        System.out.println(Araba.citroenMi(citroen1));
        System.out.println(Araba.citroenMi(ds1));
        System.out.println(Araba.getFarTipi(mercedes1));
        System.out.println(Araba.getFarTipi(ds1));
        
    }
}
