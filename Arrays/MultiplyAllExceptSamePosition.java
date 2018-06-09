/**
 * Coding Challenge
 * To multiply all elements in the array except the element in the current position
 * with the possibility of zeros in the array.
 * Time complexity: O(n)
 * Space complexity: O(n)
 *
 * @author Arihant Jain
 */

public class MultiplyAllExceptSamePosition {
    public static void main(String[] args) {
        int[] temp = {2, 3, 1, 4};
        int[] temp2 = multiplyExceptSame(temp);
        for (int i = 0; i < temp2.length; i++)
            System.out.println(temp2[i]);

    }

    private static int[] multiplyExceptSame(int[] array) {
        int[] first = new int[array.length];

        //initialize the array with 1's.
        for (int i = 0; i < first.length; i++)
            first[i] = 1;

        int product = array[0];

        //assign previous product and multiply elements to get new product from start to end.
        for (int i = 1; i < array.length; i++) {
            first[i] = product;
            product = product * array[i];
        }
        product = array[array.length - 1];

        //similarly from end to start.
        for (int i = array.length - 2; i >= 0; i--) {
            first[i] = product * first[i];
            product = product * array[i];
        }
        return first;
    }
}