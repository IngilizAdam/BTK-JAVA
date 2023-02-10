import java.util.Random;

public class RandomSayi {
    public static void main(String[] args) {
        Random random = new Random();
        int sayi = random.nextInt(10);
        System.out.println(sayi);

        int array[] = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = random.nextInt(1000);
        }

        for(int i = 0; i < 10; i++){
            System.out.println(i + ". eleman: " + array[i]);
        }

        int enBuyuk = -1;
        int enBuyugunIndexi = 0;
        for(int i = 0; i < 10; i++){
            if(array[i] > enBuyuk){
                enBuyuk = array[i];
                enBuyugunIndexi = i;
            }
        }

        System.out.println("En buyuk sayi: " + enBuyuk);
        System.out.println("En buyuk sayinin indexi: " + enBuyugunIndexi);
    }
}
