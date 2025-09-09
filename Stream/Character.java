package Stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Character {
    public static void main(String[] args) {
        /*try (FileWriter fw = new FileWriter("C:/Users/user/Desktop/JavaMe.txt")){
            fw.write("Necesen dedim hhay?");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        try(FileReader fileReader =new FileReader("C:/Users/user/Desktop/JavaMe.txt")) {
            File fr = new File("C:/Users/user/Desktop/JavaMe.txt");
            char[] chars = new char[(int) fr.length()];
            for (int i = 0; i < chars.length; i++) {
                chars[i]=(char) fileReader.read();
            }
            for (char c : chars){
                System.out.print(c);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
