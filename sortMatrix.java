import java.util.Arrays;

public class sortMatrix {

    public static void main(String[] args) {
        
        int[][] matrix = {
            {5, 8, 12},
            {1, 4, 9},
            {7, 6, 3}
        };

        int[][] sortedMatrix = sortMatrix(matrix);
        System.out.println("Sorted Matrix:");
        for (int i = 0; i < sortedMatrix.length; i++) {
            for (int j = 0; j < sortedMatrix[i].length; j++) {
                System.out.print(sortedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] sortMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] flattened = new int[rows * cols];
        int index = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flattened[index++] = matrix[i][j];
            }
        }
        Arrays.sort(flattened);
        int[][] sortedMatrix = new int[rows][cols];
        index = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sortedMatrix[i][j] = flattened[index++];
            }
        }

        return sortedMatrix;
    }
}
