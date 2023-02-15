import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Coder {
    public static void main(String[] args) {
        String kod = "#include <stdio.h>\n";
        kod += "int main(){\n";
        kod += "\tprintf(\"Hello World\");\n";

        try{
            Scanner in = new Scanner(new FileInputStream("in.txt"));
            while(in.hasNextLine()){
                String line = in.nextLine();
                kod += "\tprintf(\"" + line + "\\n\");\n";
            }
            kod += "}";

            PrintStream out = new PrintStream(new FileOutputStream("out.txt"));
            out.println(kod);
            out.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
