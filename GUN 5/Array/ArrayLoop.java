public class ArrayLoop {
    public static void main(String[] args) {
        int array[] = new int[100];
        for(int i = 0; i < 100; i++){
            System.out.println(i + ". Eleman: " + array[i]);
        }

        for(int i = 0; i < 100; i++){
            array[i] = i;
        }

        for(int i = 0; i < 100; i++){
            System.out.println(i + ". Eleman: " + array[i]);
        }
    }
}
