import java.util.Scanner;

public class Main{
    public static char oyunTahtasi[][] = new char[8][8];

    public static void main(String[] args) {
        for(int i = 0 ; i < oyunTahtasi.length; i++){
            for(int j = 0; j < oyunTahtasi[i].length; j++){
                oyunTahtasi[i][j] = '.';
            }
        }

        print();

        for(int c = 0; c < oyunTahtasi[0].length; c++){
            oyunTahtasi[0][c] = 'B';
        }

        for(int c = 0; c < oyunTahtasi[7].length; c++){
            oyunTahtasi[7][c] = 'A';
        }
        
        oyunTahtasi[4][4] = 'B';
        
        print();

        while(true){
            move();
            print();
        }
    }

    public static void print(){
        System.out.println("\n\n");
        for(int r = 0; r < oyunTahtasi.length; r++){
            for(int c = 0; c < oyunTahtasi[r].length; c++){
                System.out.print(oyunTahtasi[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void move(){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();

        while(oyunTahtasi[i][j] != 'A'){
            i = in.nextInt();
            j = in.nextInt();
        }

        if((i > 0) && (j < (oyunTahtasi[i-1].length-1)) && oyunTahtasi[i-1][j+1] == 'B'){
            oyunTahtasi[i][j] = '.';
            oyunTahtasi[i-1][j+1] = 'A';
        }
        else if((i > 0) && (j > 0) && oyunTahtasi[i-1][j-1] == 'B'){
            oyunTahtasi[i][j] = '.';
            oyunTahtasi[i-1][j-1] = 'A';
        } 
        else if((i > 0) && oyunTahtasi[i-1][j] == '.'){
            oyunTahtasi[i][j] = '.';
            oyunTahtasi[i-1][j] = 'A';
        }

        System.out.println("Yürüdün");
    }
}
