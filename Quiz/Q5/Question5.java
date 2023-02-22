public class Question5 {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4};
        a = changeArray(a);
        printArray(a);
    }

    public static int[] changeArray(int[] arr) {
        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[i] * 2;
        }
        return b;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}