import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        Scanner array= new Scanner(System.in);

        int[] num= new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println("5 Eded Reqem Daxil Edin: ");
            num[i] = array.nextInt();


        }

        for (int i = 0; i < num.length; i++) {
            System.out.println("Daxil edilen reqemler: " +num[i]);

        }

    }

}
