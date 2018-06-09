import java.util.Arrays;

/**
 * Coding Challenge
 * To find the repeating and missing element
 * Given an array with values in array lie between 1 and array.length.
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Arihant Jain
 */

public class FindMissingAndRepeatedElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMissingRepeated(new int[]{4, 3, 6, 2, 1, 1})));
    }

    private static int[] findMissingRepeated(int[] array) {
        int[] answer = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (array[Math.abs(array[i]) - 1] < 0)
                answer[0] = Math.abs(array[i]);
            else array[Math.abs(array[i]) - 1] = -array[Math.abs(array[i]) - 1];
        }
        for (int i = 0; i < array.length; i++)
            if (array[i] > 0)
                answer[1] = i + 1;
        return answer;
    }
}