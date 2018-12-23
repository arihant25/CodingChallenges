import java.util.Arrays;

/**
 * Given an array of integers.
 * To return a new array such that each element at index i of the new array is the product of all the numbers in the
 * original array except the one at i.
 * Time complexity: O(n)
 */

public class MulDiv {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mulDiv(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(mulDiv(new int[]{3, 2, 1})));
    }

    private static int[] mulDiv(int[] array) {
        int[] ret = new int[array.length];
        int product = 1;
        for (int i = 0; i < array.length; i++)
            product = product * array[i];

        for (int i=0; i < array.length; i++)
            ret[i] = product / array[i];

        return ret;
    }
}