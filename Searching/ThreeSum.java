/**
 *LeetCodeProblems
 *To find triplets from an array that equals zero.
 *
 *@author Arihant Jain
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        for (int i=0; i<nums.length-2; i++) 
            for (int j=i+1; j<nums.length-1; j++) 
                for (int k=j+1; k<nums.length; k++) 
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort(Comparator.naturalOrder());
                        if (hs.add(temp))
                            result.add(temp);
                    }
        return result;
        
        // Bidirectional approach, O(n^2) solution.
        // 
        // Arrays.sort(nums);
        // List<List<Integer>> result = new LinkedList<>(); 
        // for (int i = 0; i < nums.length-2; i++) {
        //     if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
        //         int low = i+1, high = nums.length-1, sum = 0 - nums[i];
        //         while (low < high) {
        //             if (nums[low] + nums[high] == sum) {
        //                 result.add(Arrays.asList(nums[i], nums[low], nums[high]));
        //                 while (low < high && nums[low] == nums[low+1]) 
        //                      low++;
        //                 while (low < high && nums[high] == nums[high-1]) 
        //                      high--;
        //                 low++; high--;
        //             } else if (nums[low] + nums[high] < sum) 
        //                  low++;
        //             else high--;
        //         }
        //     }
        // }
        // return result;
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
    
    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }
        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }
    
    public static String int2dListToString(List<List<Integer>> nums) {
        StringBuilder sb = new StringBuilder("[");
        for (List<Integer> list: nums) {
            sb.append(integerArrayListToString(list));
            sb.append(",");
        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            List<List<Integer>> ret = new Solution().threeSum(nums);
            String out = int2dListToString(ret);
            System.out.print(out);
        }
    }
}