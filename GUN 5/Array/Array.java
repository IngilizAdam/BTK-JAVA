public class Array{
    public static void main(String[] args) {
        int sayi1 = 5;
        int intArrayi[] = new int[5];
        intArrayi[0] = 0;
        intArrayi[1] = 1;
        intArrayi[2] = 2;
        intArrayi[3] = 3;
        intArrayi[4] = 4;
        // intArrayi[5] = 5;

        System.out.println(intArrayi[0]);
        System.out.println(intArrayi[1]);
        System.out.println(intArrayi[2]);
        System.out.println(intArrayi[3]);
        System.out.println(intArrayi[4]);

        System.out.println("Uzunluk: " + intArrayi.length);

        int yeniArray[] = {0,5,10,3,2};
        for(int i = 0; i < yeniArray.length; i++){
            System.out.println(i + ". eleman: " + yeniArray[i]);
        }
    }
}