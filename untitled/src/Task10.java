public class Task10 {
    public static void main(String[] args) {
        for (int i = 5; i <=5  ; i--) {       //++i olanda nece bitmir dongu yene devam edir?

            if (i <=0)
                  break;
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
