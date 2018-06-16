import java.util.Arrays;

/**
 * LeetCodeProblems
 * To find triplets sum from an array that is closest to the target sum.
 * Time complexity: O(n^2)
 *
 * @author Arihant Jain
 */

public class ThreeSumClosest {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, 4}, 1));
    }

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int answer = nums[0] + nums[1] + nums[2];
        int minDis = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                if (nums[i] + nums[low] + nums[high] == target)
                    return target;

                else if (nums[i] + nums[low] + nums[high] > target) {
                    if (minDis > Math.abs(target - (nums[i] + nums[low] + nums[high]))) {
                        minDis = Math.abs(target - (nums[i] + nums[low] + nums[high]));
                        answer = nums[i] + nums[low] + nums[high];
                    }
                    high--;

                } else {
                    if (minDis > Math.abs(target - (nums[i] + nums[low] + nums[high]))) {
                        minDis = Math.abs(target - (nums[i] + nums[low] + nums[high]));
                        answer = nums[i] + nums[low] + nums[high];
                    }
                    low++;
                }
            }
        }
        return answer;
    }
}