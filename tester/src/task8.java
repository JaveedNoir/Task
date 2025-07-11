public class task8 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int num = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += num;
                num++;

            }


        }
        for (int[] row : matrix) {
            for (int number : row) {

                System.out.print(number + " ");

            }
            System.out.println(" ");

        }
    }
}