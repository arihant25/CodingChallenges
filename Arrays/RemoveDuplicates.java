import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/**
 *LeetCodeProblems
 *To remove the duplicates from an integer array.
 *
 *@author Arihant Jain
 */


public class RemoveDuplicates {
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

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            System.out.print(removeDuplicates(nums));
        }
    }

    public static int removeDuplicates(int[] nums) {
        // int j = 1;
        // for (int i=1;i<nums.length;i++)
        //     if (nums[i] > nums[i-1])
        //         nums[j++] = nums[i];
        // return j;

        //using hashset
        HashSet<Integer> hs = new HashSet<>();
        int answer = 0;
        for (int i=0; i<nums.length; i++)
            if (hs.add(nums[i]))
                answer++;
        int j = 0;
        for (int s : hs)
            nums[j++] = s;
        for (int s = j;s<nums.length;s++)
            nums[s] = 999999999;
        Arrays.sort(nums);
        return answer;
    }
}