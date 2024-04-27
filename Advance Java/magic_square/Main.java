public class Main {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix();
        printMatrix(matrix);
    }

    public static int[][] generateMatrix() {
        int[][] matrix = new int[3][3];
        int n = 3;
        int row = 0;
        int col = n / 2;
        int num = 1;

        while (num <= n * n) {
            matrix[row][col] = num;
            num++;
            row--;
            col++;

            if (row < 0 && col == n) {
                row = 1;
                col = n - 1;
            } else if (row < 0) {
                row = n - 1;
            } else if (col == n) {
                col = 0;
            } else if (matrix[row][col] != 0) {
                row += 2;
                col--;
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
