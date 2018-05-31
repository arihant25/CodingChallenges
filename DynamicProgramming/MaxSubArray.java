/**
 *LeetCodeProblems
 *To find the maximum subarray. (Kadane's Algorithm)
 *
 *@author Arihant Jain
 */

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        for (int i=1; i<nums.length; i++)
            nums[i] = Math.max(nums[i-1] + nums[i], nums[i]);
        int answer = nums[0];
        for (int i=0; i<nums.length; i++)
            if (answer < nums[i])
                answer = nums[i];
        return answer;
    }
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            int ret = new Solution().maxSubArray(nums);
            String out = String.valueOf(ret);
            System.out.print(out);
        }
    }
}
