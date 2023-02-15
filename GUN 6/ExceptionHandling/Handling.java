public class Handling{
    public static void main(String[] args) {
        int array[] = new int[5];

        try{
            System.out.println("Deniyorum");
            System.out.println(array[10]);
            System.out.println("Devam");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Hello World");
    }
}
