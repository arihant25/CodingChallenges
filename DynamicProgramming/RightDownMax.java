/**
 * CodingChallenge
 * To find the maximum sum starting from first element to the bottom right only moving bottom and right.
 *
 * @author Arihant Jain
 */

public class RightDownMax {
    public static void main(String[] args) {
        int[][] test = {{5, 10}, {15, 2}};
        System.out.println(rDM(test));
    }

    private static int rDM(int[][] array) {
        //right and bottom most row initialization.
        for (int i = array.length - 2; i >= 0; i--) {
            array[array.length - 1][i] = array[array.length - 1][i] + array[array.length - 1][i + 1];
            array[i][array.length - 1] = array[i][array.length - 1] + array[i + 1][array.length - 1];
        }
        for (int i = array.length - 2; i >= 0; i--)
            for (int j = array.length - 2; j >= 0; j--)
                array[i][j] = Math.max(array[i][j + 1] + array[i][j], array[i][j] + array[i + 1][j]);
        return array[0][0];
    }
}