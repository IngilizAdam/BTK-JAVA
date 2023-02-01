import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int not = klavye.nextInt();

        /*
         * 100 AA
         * 90  BA
         * 85  BB
         * 80  CB
         * < 80   FF
         */

        if(not > 100 || not < 0){
        System.exit(0);
        }

        switch(not){
        case 100:
            System.out.println("AA aldin");
            break;
        case 90:
            System.out.println("BA aldiniz");
            break;
        case 85:
            System.out.println("BB aldiniz");
            break;
        case 80:
            System.out.println("CB aldiniz");
            break;
        default:
            System.out.println("FF aldiniz");
            break;
        }
    }
}
