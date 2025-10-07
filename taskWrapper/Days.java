package taskWrapper;

import static taskWrapper.Main.input;

public enum Days {
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

    final int day;

private Days(int day){
    this.day=day;
}


    public static void printDays() {
        try {
            System.out.println("Gunu qeyd edin: ");
            int inputDay=input.nextInt();

            if (inputDay == Monday.day) {
                System.out.println("Birinci Gun! *IS GUNU BASLADI*");
            } else if (inputDay == Tuesday.day) {
                System.out.println("Cersenbe Axsami !");
            } else if (inputDay == Wednesday.day) {
                System.out.println("Cersenbe Gunu!");
            } else if (inputDay == Thursday.day) {
                System.out.println("Cume Axsami!");
            } else if (inputDay == Friday.day) {
                System.out.println("Cume Gunu!");
            } else if (inputDay == Saturday.day) {
                System.out.println("Senbe Gunu *ISTIRAHET GUNU*");
            } else if (inputDay == Sunday.day) {
                System.out.println("Bazar Gunu!");
            } else {
                throw new validDayChooser("Yanlis bir gun yazmisiniz!");
            }
        }catch (validDayChooser validDayChooser){
            System.out.println(validDayChooser.getMessage());
        }
    }
}
