import java.util.Scanner;

public class ObjeOlustur {
    public static void main(String[] args) {
        Scanner objeIsmi = new Scanner(System.in);
        objeIsmi.nextInt();
        // Scanner.nextInt();
        /*
         * nextInt() metotu static olmadigi icin
         * Scanner.nextInt() olarak erisilmez.
         * Once Scanner turunde bir obje olusturulur (objeIsmi)
         * Sonra o obje uzerinden nextInt() metotuna erisilir.
         */
    }
}
