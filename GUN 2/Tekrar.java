import java.util.Scanner;

public class Tekrar{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int sayi1 = keyboard.nextInt(); // giris yapilan para
        int sayi2 = keyboard.nextInt(); // harcanan para

        int paraUstu = sayi1 - sayi2;

        // 1 kurus, 5 kurus, 20 kurusluk bozuk paralar var

        int kurus20 = paraUstu / 20;
        paraUstu = paraUstu % 20;
        int kurus5 = paraUstu / 5;
        paraUstu %= 5; // bu satir sununla ayni: paraUstu = paraUstu % 5;
        int kurus1 = paraUstu;

        System.out.println("20 kurus: " + kurus20);
        System.out.println("5 kurus: " + kurus5);
        System.out.println("1 kurus: " + kurus1);
    }
}