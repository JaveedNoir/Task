public class matrixArray {
    public static void main(String[] args) {
        int[][]matrix = new int[5][5];
        int num =1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]= num;
                num++;
            }


        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j]+" ");
            }


        }
    }
}
