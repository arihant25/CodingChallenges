/**
 * Cracking the coding interview
 * <p>
 * Input is a m*n matrix.
 * To output, if there is a zero in the matrix then, the row and the column is set to zero.
 * Time complexity: O(m*n)
 * Space complexity: O(m+n)
 *
 * @author Arihant Jain
 */

public class ReplaceInAMatrixWithZero {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1}, {1, 0, 1}};
        convertMatrix(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j]);
            System.out.println();
        }
    }

    private static void convertMatrix(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (rows[i] || columns[j])
                    matrix[i][j] = 0;

    }
}
