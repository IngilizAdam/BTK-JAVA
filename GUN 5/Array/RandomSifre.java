import java.util.Random;

public class RandomSifre {
    public static void main(String[] args) {
        Random random = new Random();
        
        /*
        int length1 = random.nextInt(20);
        while(length1 < 8){
            System.out.println(length1 + " buldum. Yeniden uretiyorum...");
            length1 = random.nextInt(20);
        }

        System.out.println("Length: " + length1);
        */
        // YUKARISININ MANTIGI
        // ASAGISI ILE AYNI

        int length2 = random.nextInt(12) + 8;
        String sifre = "";
        char array[] = new char[length2];
        System.out.println(length2);
        for(int i = 0; i < length2; i++){
            int sayi = random.nextInt(94) + 33;
            char karakter = (char)sayi;
            sifre += karakter;
            array[i] = karakter;
        }
        System.out.println(sifre);
        
        for(int i = 0; i < length2; i++){
            System.out.print(array[i]);
        }
    }
}
