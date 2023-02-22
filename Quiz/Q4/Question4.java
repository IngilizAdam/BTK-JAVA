public class Question4 {
    public static void main(String[] args) {
        printChars("a");
    }

    public static void printChars(String kelime) {
        if (kelime.length() == 3) {
            System.out.print(kelime + " ");
            return;
        }

        System.out.print(kelime + " ");
        printChars(kelime + "c");
    }
}