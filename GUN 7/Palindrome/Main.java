import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kelime = in.next(); // bosluga kadar okur
        System.out.println("Kelime: " + kelime);

        boolean palindromdur = true;
        for(int i = 0; i < kelime.length()/2; i++){
            int digerKarakterAdresi = kelime.length()-1-i;
            if( kelime.charAt(i) != kelime.charAt(digerKarakterAdresi) ){
                palindromdur = false;
                break;
            }
        }
        if(palindromdur){
            System.out.println("Palindrom");
        } else{
            System.out.println("Palindrom degil");
        }
    }
}
