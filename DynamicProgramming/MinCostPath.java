/**
 * CodingChallenge
 * To find the minimum cost of travelling from first to the last element in a 2D array using dynamic programming.
 *
 * @author Arihant Jain
 */

public class MinCostPath {
    public static void main(String[] args) {
        System.out.println(minCost(new int[][]{{1, 2, 3}, {4, 8, 2}, {1, 5, 3}}));
    }

    private static int minCost(int[][] array) {
        //Initialization of bottom row and right column.
        for (int i = array.length - 2; i >= 0; i--) {
            array[array.length - 1][i] = array[array.length - 1][i] + array[array.length - 1][i + 1];
            array[i][array.length - 1] = array[i][array.length - 1] + array[i + 1][array.length - 1];
        }

        for (int i = array.length - 2; i >= 0; i--)
            for (int j = array.length - 2; j >= 0; j--)
                array[i][j] = Math.min(Math.min(array[i + 1][j], array[i][j + 1]), array[i + 1][j + 1]) + array[i][j];
        return array[0][0];
    }
}