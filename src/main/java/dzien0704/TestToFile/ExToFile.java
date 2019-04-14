package dzien0704.TestToFile;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ExToFile {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(Paths.get("test.txt"));
            while (scanner.hasNextLine()) {
                String a = scanner.nextLine();
                System.out.println(a);
            }
        } catch(IOException e){
            System.out.println("nie udalo sie!!!");
        }
    }
}
