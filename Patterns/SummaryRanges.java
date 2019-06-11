import java.util.ArrayList;
import java.util.List;

/**
 * LeetcodeProblems
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 * <p>
 * Input:  [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 *
 * @author Arihant Jain
 */


public class SummaryRanges {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }

    private static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while ((i + 1 < nums.length) && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (start != nums[i]) {
                list.add(start + "->" + nums[i]);
            } else list.add(Integer.toString(nums[i]));
        }
        return list;
    }
}
