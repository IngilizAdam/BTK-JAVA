import java.util.Random;

public class MultiDimensional {
    public static void main(String[] args) {
        int array[][] = new int[10][5];

        for(int r = 0; r < 10; r++){
            for(int c = 0; c < 5; c++){
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }

        Random random = new Random();

        for(int r = 0; r < 10; r++){
            for(int c = 0; c < 5; c++){
                array[r][c] = random.nextInt(5);
            }
        }

        System.out.println("\n--------------------\n");

        for(int r = 0; r < 10; r++){
            for(int c = 0; c < 5; c++){
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("[0,0]: " + array[0][0]);
        System.out.println("[0,1]: " + array[0][1]);
        System.out.println("[0,4]: " + array[0][4]);
        System.out.println("[1,0]: " + array[1][0]);
        System.out.println("[1,4]: " + array[1][4]);
        System.out.println("[4,2]: " + array[4][2]);
        System.out.println("[8,1]: " + array[8][1]);
    }
}
