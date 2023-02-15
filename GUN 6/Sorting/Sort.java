import java.util.Random;

public class Sort{
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[5];
        for(int i = 0 ; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(i + ". " + array[i]);
        }

        System.out.println("Sorting...\n");
        for(int i = 0; i < array.length; i++){
            int min = 200;
            int minIndex = 0;
            for(int j = i; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = min;
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(i + ". " + array[i]);
        }
    }
}
