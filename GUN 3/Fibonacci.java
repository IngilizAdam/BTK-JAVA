import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int nSayisi = klavye.nextInt();
        klavye.close();
        
        long birOnceki = 1;
        long ikiOnceki = 1;
        if(nSayisi < 1){
            System.exit(0);
        }
        else if(nSayisi == 1){
            System.out.print("1 ");
        } else{
            System.out.print("1 1 ");
        }
        for(int i = 0; i < nSayisi-2; i++){
            long ucuncuEleman = birOnceki + ikiOnceki; // 1 1 2
            ikiOnceki = birOnceki;
            birOnceki = ucuncuEleman;
            System.out.print(ucuncuEleman + " ");
        }
    }
}
