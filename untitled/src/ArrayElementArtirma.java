public class ArrayElementArtirma {
    public static void main(String[] args) {
        int[] num = new int[10];
        num[0]=2;

        for (int i = 1; i < num.length; i++) {
            num[i]= num[i-1] *2;





        }
        for (int a = 0; a < num.length; a++) {
            System.out.println("num"+a+" "+num[a]);

        }
    }
}
