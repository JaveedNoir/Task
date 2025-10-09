package shehriTaskSeasons;

import static shehriTaskSeasons.Main.input;

public enum Seasons implements Month {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;

    @Override
    public void printMonth() {

        while (true) {
            System.out.println("Zehmet olmasa fesil daxil edin: ");
            String seasonsInput = input.nextLine().toUpperCase();
            switch (seasonsInput) {
                case "SPRING":
                    System.out.println("Mart\nAprel\nMay");
                    break;
                case "SUMMER":
                    System.out.println("Iyun\nIyul\nAvqust");
                    break;
                case "AUTUMN":
                    System.out.println("Sentyabr\nOktyabr\nNoyabir");
                    break;
                case "WINTER":
                    System.out.println("Dekabr\nYanvar\nFevral");
                    break;
                default:
                    return;
            }
        }
    }
}
