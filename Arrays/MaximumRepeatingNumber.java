/**
 * Coding Challenge
 * To find the maximum repeating number in the array.
 * Given that array length >= k.
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Arihant Jain
 */

public class MaximumRepeatingNumber {
    public static void main(String[] args) {
        MaximumRepeatingNumber maximumRepeatingNumber = new MaximumRepeatingNumber();
        System.out.println(maximumRepeatingNumber.maxRepeat(new int[]{1, 2, 3, 3, 4, 5, 5, 3}, 6));
    }

    private int maxRepeat(int[] array, int k) {
        int answer = 0;
        for (int i = 0; i < array.length; i++)
            array[array[i] % k] += k;
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (max < array[i]) {
                max = array[i];
                answer = i;
            }
        return answer;
    }
}