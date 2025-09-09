package Stream;

import java.io.*;

public class Byte {
    public static void main(String[] args) {
      /*  try (FileOutputStream fos = new FileOutputStream("C:/Users/user/Desktop/JavaMeByte.txt")) {
            fos.write("Necesen Byte".getBytes());


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/
        /*try (FileInputStream fis = new FileInputStream("C:/Users/user/Desktop/JavaMeByte.txt")){
            File file=new File("C:/Users/user/Desktop/JavaMeByte.txt");
            char[] chars = new char[(int)file.length()];
            for (int i = 0; i < file.length(); i++) {
                chars[i]=(char) fis.read();
            }
            for (char c : chars){
                System.out.print(c);
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }*/

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:/Users/user/Desktop/JavaMeByte.txt"))) {
            File file = new File("C:/Users/user/Desktop/JavaMeByte.txt");
            char[] chars = new char[(int)file.length()];
            for (int i = 0; i < chars.length; i++) {
                chars[i]=(char) bis.read();
            }
            for (char c : chars){
                System.out.print(c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
