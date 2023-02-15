import java.io.FileInputStream;
import java.util.Scanner;

public class Oku{
    public static void main(String[] args) {
        try{
            //Scanner in = new Scanner(new FileInputStream("jhghj.txt"));
            Scanner in = new Scanner(new FileInputStream("text.txt"));
            System.out.println(in.nextLine());
            System.out.println(in.nextLine());
            while(in.hasNextLine()){
                String line = in.nextLine();
                line = line.trim();
                if(line.length() > 0){
                    System.out.println(line);
                }
            }
            in.close();

            System.out.println("Okuma islemi bitti");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
