import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ThreeSumList {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> check = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = j; k < nums.length; k++) {
                    if (i != j && j != k)
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> sol = new ArrayList<>();
                            sol.add(nums[i]);
                            sol.add(nums[j]);
                            sol.add(nums[k]);
                            Collections.sort(sol);
                            if (check.add(sol)) {
                                ans.add(sol);
                            }
                        }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
