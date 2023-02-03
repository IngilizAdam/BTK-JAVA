public class While {
    public static void main(String[] args) {

        /*
        for(int i = 0; i < 10; i++){
            System.out.println(i + ". Hello World");
        }
        */

        /*int i = 0;
        while(true){
            System.out.println(i + ". Hello World");
            i++;
            if(i == 10){
                break;
            }
        }*/

        int i = 0;
        while(true){
            i = 0;
            System.out.println("Dongu 1");
            while(true){
                System.out.println("Dongu 2");
                i++;
                if(i == 10){
                    break;
                }
            }
            System.out.println("Bitti");
        }
    }
}
