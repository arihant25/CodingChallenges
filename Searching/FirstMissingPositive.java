import java.util.Arrays;

/**
 * LeetCodeProblems
 * To find the first missing positive integer.
 * Given an array with integers a1,..,an.
 * Time complexity: O(nlogn)
 * Note: To add a O(n) time solution.
 *
 * @author Arihant Jain
 */

public class FirstMissingPositive {
    private static int firstMissingPositive(int[] nums) {
        if (nums.length == 0)
            return 1;

        Arrays.sort(nums);
        int start = 1, point = 0;
        boolean ans = false;

        while (point < nums.length && nums[point] <= 0)
            point++;

        while (!ans && point < nums.length) {
            if (nums[point] != start) {
                ans = true;
            } else {
                while (point + 1 < nums.length && nums[point] == nums[point + 1])
                    point++;
                start++;
                point++;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 2, 2, 1, 3, 1, 0, 4, 0}));
    }
}