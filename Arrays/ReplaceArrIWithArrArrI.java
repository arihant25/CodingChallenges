import java.util.Arrays;

/**
 * Coding Challenge
 * To replace all array[i] with array[array[i]], given range of all numbers is between 0 to array.length-1.
 * Explanation: (a + b * c) / c = b and (a + b * c) % c = a, given 0 <= a,b < c
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Arihant Jain
 */

public class ReplaceArrIWithArrArrI {
    public static void main(String[] args) {
        int[] temp = {1, 3, 2, 4, 0};
        replaceIWithArrI(temp);
        System.out.println(Arrays.toString(temp));
    }

    private static void replaceIWithArrI(int[] array) {
        //with this, the array holds both the values, array[i](%array.length) and array[array[i]](/array.length)
        //%array.length is to ensure that array[array[i]] !>= array.length
        for (int i = 0; i < array.length; i++)
            array[i] += array[array[i]] % array.length * array.length;
        for (int i = 0; i < array.length; i++)
            array[i] /= array.length;
    }
}