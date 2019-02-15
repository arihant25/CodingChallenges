import java.util.Arrays;
import java.util.HashMap;

/**
 * LeetCodeProblems
 * To return indices of the two numbers such that they add up to a specific target..
 *
 * @author Arihant Jain
 */

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            hashmap.put(nums[i], i);
        }
        for (int i=0; i<nums.length; i++) {
            if (hashmap.containsKey(target - nums[i])) {
                if (hashmap.get(target - nums[i])!=i) {
                    return new int[]{i, hashmap.get(target - nums[i])};
                }
            }
        }
        return null;
    }

//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i != j) {
//                    if (nums[i] + nums[j] == target) {
//                        return new int[]{i, j};
//                    }
//                }
//            }
//        }
//        return null;
//    }
}
