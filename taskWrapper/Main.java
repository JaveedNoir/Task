package taskWrapper;

import java.util.Scanner;

public class Main {
    static public Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

       Days.printDays();

        Storage<Integer> cavidGpt = new Storage<>("Cavid","Guleliyev",181);
        Storage<String> agalarCSharp = new Storage<>("Agalar","Mamedov","Bilmirem");
        System.out.println(cavidGpt);
        System.out.println(agalarCSharp);
    }
}
