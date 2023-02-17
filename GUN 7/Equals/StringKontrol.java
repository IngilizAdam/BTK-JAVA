public class StringKontrol{
    public static void main(String[] args) {
        String test1 = new String("str");
        String test2 = new String("str");
        System.out.println(test1 == test2);
        System.out.println(test1.equals(test2));
        System.out.println(test2.equals(test1));
        System.out.println(test2.equalsIgnoreCase(test2));
    }
}
