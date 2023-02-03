import java.util.Scanner;

public class FibonacciMetot {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        String gelenVeri = fibonacci(klavye.nextInt());
        System.out.println(gelenVeri);
        //System.out.println(fiboRecursion(1000));
        System.out.println(factorial(10000));
    }

    public static String fibonacci(int nSayisi){
        long birOnceki = 1;
        long ikiOnceki = 1;
        String fiboSerisi = "";
        if(nSayisi < 1){
            return "";
        }
        else if(nSayisi == 1){
            fiboSerisi = "1 ";
        } else{
            fiboSerisi = "1 1 ";
        }
        for(int i = 0; i < nSayisi-2; i++){
            long ucuncuEleman = birOnceki + ikiOnceki; // 1 1 2
            ikiOnceki = birOnceki;
            birOnceki = ucuncuEleman;
            
            fiboSerisi += ucuncuEleman + " ";
        }

        return fiboSerisi;
    }

    public static int fiboRecursion(int n){
        if(n <= 1){
            return n;
        }
        return (fiboRecursion(n-1) + fiboRecursion(n-2));
    }

    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
