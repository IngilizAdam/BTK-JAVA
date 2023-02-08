public class ClassVariable{
    public static final int SABIT_SAYI = 3;

    public static void main(String[] args) {
        ClassVariable.degiskenSayi = 20;
        System.out.println(degiskenSayi);
        //public static int sayi = 9;
    }
    public static int degiskenSayi = 5;
}