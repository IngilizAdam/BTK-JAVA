import java.util.Scanner;

public class UcgenCiz {
    public static void main(String[] args) {
        /*
         * *
         * **
         * ***
         * ****
         * *****
         */

        Scanner klavye = new Scanner(System.in);
        System.out.println("Kac satir olsun?");
        int satirSayisi = klavye.nextInt();

        for(int i = 0; i <= satirSayisi; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
