public class Islemler {
    public static void main(String[] args) {
        System.out.println( 5 + 2 ); // int + int = int
        System.out.println( 5 + 2.0 ); // int + double = double
        System.out.println( "yazi" + 5 ); // String + int = String (yan yana birlestirme yapar (concatenation))
        System.out.println( "5" + "2" ); // String + String = String (concatenation)
        System.out.println( 5 - 2 ); // int - int = int
        System.out.println( 5 - 2.0); // int - double = double
        // System.out.println( "yazi" - "yazi" ); // Stringlerle - operatoru kullanilamaz
        System.out.println( 5 / 2 ); // int / int = int gelir ve bolme islemi sonucundaki tam kismi hesaplar
        System.out.println( 5 / 2.0 ); // int / double = double gelir ve virgullu hesaplar
    }
}
