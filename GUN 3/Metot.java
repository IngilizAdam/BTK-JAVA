public class Metot {

    public static String helloWorld(){
        System.out.println("Hello World");
        return "donulen string";
    }

    public static void main(String[] args) {
        System.out.println(helloWorld());
        System.out.println(ortalamaHesapla(5, 10));
        Metot.print("metota gonderilen string");
    }

    public static void print(String yazi){
        System.out.print("String geldi: ");
        System.out.println(yazi);
    }

    public static void print(double sayi){
        System.out.print("Double geldi: ");
        System.out.println(sayi);
    }

    public static double ortalamaHesapla(int sayi1, int sayi2){
        double ortalama = ((sayi1 + sayi2)*1.0)/2;
        return ortalama;
    }
}
