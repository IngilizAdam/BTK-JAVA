public class BooleanArray {
    public static void main(String[] args) {
        boolean array[] = new boolean[10];
        for(int i = 0; i < 10; i++){
            System.out.println(i + ". Eleman: " + array[i]);
        }

        array[8] = true;

        for(int i = 0; i < 10; i++){
            System.out.println(i + ". Eleman: " + array[i]);
        }
    }
}
