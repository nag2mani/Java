public class Main {

    // Generate the matrix and print all the required matrix.
    public static void main(String[] args) {
        int[][] requiredMatrix = generateAllMatrix();
        printAllMatrix(requiredMatrix);
    }


    // Function to generate the original magic square matrix
    public static int[][] generateAllMatrix() {
        int[][] requiredMatrix = new int[3][3];
        int n = 3;
        int row = 0;
        int col = n / 2;
        int num = 1;

        // Loop to fill the matrix with numbers in a magic square pattern
        while (num <= n * n) {
            requiredMatrix[row][col] = num;
            num++;
            row--;
            col++;

            // Handle wrapping around if going out of bounds
            if (row < 0 && col == n) {
                row = 1;
                col = n - 1;
            } else if (row < 0) {
                row = n - 1;
            } else if (col == n) {
                col = 0;
            } else if (requiredMatrix[row][col] != 0) {
                row += 2;
                col--;
            }
        }
        return requiredMatrix;
    }


    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }


    // Function to print the original and rotated matrices
    public static void printAllMatrix(int[][] matrix) {
        System.out.println("First Matrix: ");
        printMatrix(matrix);
        System.out.println("Second Matrix: ");
        printMatrix(rotateMatrixClockwise(matrix));
        System.out.println("Third Matrix: ");
        printMatrix(rotateMatrixClockwise(rotateMatrixClockwise(matrix)));
        System.out.println("Fourth Matrix: ");
        printMatrix(rotateMatrixClockwise(rotateMatrixClockwise(rotateMatrixClockwise(matrix))));
    }


    // Function to rotate a matrix clockwise by 90 degrees
    public static int[][] rotateMatrixClockwise(int[][] matrix) {
        int n = matrix.length;
        int[][] rotatedMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

}

