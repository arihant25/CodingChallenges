/**
 * CodingChallenge
 * Find duplicate element in an array.
 * The elements are in the range 1 to n.
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Arihant Jain
 */

public class FindDuplicate {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }

    private static int findDuplicate(int[] nums) {
        int low = nums[0], high = nums[0];
        do {
            low = nums[low];
            high = nums[nums[high]];
        } while (low != high);
        high = nums[0];
        while (low != high) {
            low = nums[low];
            high = nums[high];
        }
        return low;
    }
}
