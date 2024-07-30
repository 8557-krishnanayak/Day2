package Array;

public class Question3 {
    public static void main(String[] args) {

        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{4, 3}, {2, 1}};

        int[][] val = matrix_add(arr1, arr2);

        printMatrix(val);
        multiplyMatrix(arr1, arr2);
    }

    public static int[][] matrix_add(int[][] arr1, int[][] arr2) {

        int[][] arr = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return arr;
    }

    public static void multiplyMatrix(int[][] A, int[][] B) {
        int row1 = A.length;
        int col1 = A[0].length;

        int row2 = B.length;
        int col2 = B[0].length;
        int i, j, k;
        if (row2 != col1) {

            System.out.println("Multiplication Not Possible");
            return;
        }

        int[][] C = new int[row1][col2];

        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }

        printMatrix(C);
    }

    public static void printMatrix(int[][] M) {
        int rowSize = M.length;
        int colSize = M[0].length;

        System.out.println();
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }
}
