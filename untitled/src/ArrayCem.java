public class ArrayCem {
    public static void main(String[] args) {
        int[] num = new int[20];
        int bolunenCem = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            if (num[i] % 3 == 0) {
                bolunenCem += num[i];
                System.out.println("3-e Bolunenler " + num[i]);

            }

        }
        System.out.println("Bolunen cem: "+bolunenCem);
    }
}
