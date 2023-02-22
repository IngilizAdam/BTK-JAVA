public class VoidReturn{
    public static void main(String[] args) {
        test(3);
        System.out.println(intDondur());
        System.out.println(doubleDondur());
        System.out.println(stringDondur());
        //System.out.println(test(10));
    }
    
    private static void test(int a){
        if(a > 5){
            return;
        }
        System.out.println("return etmedim");
        //return; // her metot sonunda gizli bir return var
    }

    private static int intDondur(){
        System.out.println("HEY");
        return 5;
    }

    private static double doubleDondur(){
        return 1.0;
    }

    private static String stringDondur(){
        return "string";
    }

}
