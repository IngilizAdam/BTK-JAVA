import java.util.ArrayList;
import java.util.Random;

public class ArrayListOrnek {
    public static void main(String[] args) {
        ArrayList yeniArrayList = new ArrayList<Integer>();
        System.out.println("Boyut: " + yeniArrayList.size());
        yeniArrayList.add(3);
        System.out.println("0. Indexdeki eleman: " + yeniArrayList.get(0));
        System.out.println("Boyut: " + yeniArrayList.size());

        Random random = new Random();
        for(int i = 0; i < 100; i++){
            yeniArrayList.add(random.nextInt(1000));
        }

        System.out.println(yeniArrayList);

        System.out.println("\n1. indexi siliyorum...");
        yeniArrayList.remove(1);

        System.out.println(yeniArrayList);

        System.out.println("\n3. indexe 10 ekliyorum...");
        yeniArrayList.add(3, 10);

        System.out.println(yeniArrayList);

        yeniArrayList.sort(null);
        System.out.println(yeniArrayList);
    }
}
