public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 8, 12, 79, 23, 45, 74, 63, 40, 20};
        int enBoyukArr =arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (enBoyukArr < arr[i]){
                enBoyukArr=arr[i];
            }

        }
        System.out.println(enBoyukArr);


    }

}
