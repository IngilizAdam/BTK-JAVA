import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Notunuzu girin: ");
        int not;
        not = keyboard.nextInt();

        /*
         * 90-100 AA
         * 85-90  BA
         * 80-85  BB
         * 75-80  CB
         * < 75   FF
         */

         /*if(not > 100) {
            System.out.println("Hatali giris");
            System.exit(0);
         }*/
         
        if(not >= 90 && not <= 100) {
        System.out.println("AA aldiniz");
        }
        else if(not >= 85 && not < 90) {
        System.out.println("BA aldiniz");
        }
        else if(not >= 80 && not < 85) {
        System.out.println("BB aldiniz");
        }
        else if(not >= 75 && not < 80) {
        System.out.println("CB aldiniz");
        }
        else if(not > 100 || not < 0) {
        System.out.println("Hatali giris");
        }
        else {
        System.out.println("FF aldiniz");
        }

        System.out.println("Program bitti");
    }
}
