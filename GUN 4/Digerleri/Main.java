public class Main {
    public static void main(String[] args) {
        System.out.println(ClassVariable.degiskenSayi);
        System.out.println(ClassVariable.SABIT_SAYI);
        System.out.println("Degistiriliyor...");
        ClassVariable.degiskenSayi = 10;
        //ClassVariable.SABIT_SAYI = 5; // compile olmaz
        System.out.println(ClassVariable.degiskenSayi);
        System.out.println(ClassVariable.SABIT_SAYI);
        //ClassVariable.sayi;
    }
}
