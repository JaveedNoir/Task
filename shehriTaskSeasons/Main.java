package shehriTaskSeasons;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        Seasons.SPRING.printMonth();
        Pair<String,Integer> first = new Pair<>("Salam",10);
        Pair<String,Double> second = new Pair<>("Necesen",2.0);

        first.display();
        second.display();
    }
}
