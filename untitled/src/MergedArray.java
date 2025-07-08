public class MergedArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7};
        int[] mergedArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length+i] =array2[i];
        }
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.println(mergedArray[i]);

        }

    }


}
