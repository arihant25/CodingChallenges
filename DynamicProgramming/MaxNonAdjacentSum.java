/**
 * CodingChallenge
 * Given a list of integers, write a function that returns the largest sum of non-adjacent numbers.
 * Numbers can be 0 or negative.
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Arihant Jain
 */

public class MaxNonAdjacentSum {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{2, 4, 6, 2, 5}));
        System.out.println(maxSum(new int[]{5, 1, 1, 5}));
    }

    private static int maxSum(int[] array) {
        int inclusive = Integer.max(array[0], array[1]);
        int exclusive = array[0];

        for (int i = 2; i < array.length; i++) {
            int temp = inclusive;
            inclusive = Integer.max(inclusive, exclusive + array[i]);
            exclusive = temp;
        }
        return Integer.max(inclusive, exclusive);
    }
}
