import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * LeetCodeProblems
 * To find triplets from an array that equals zero.
 * Time complexity: O(n^2)
 *
 * @author Arihant Jain
 */


public class ThreeSum {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
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
        for (int index = 0; index < length; index++) {
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
        for (List<Integer> list : nums) {
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
            System.out.print(threeSum(nums));
        }
    }

    public static List<List<Integer>> threeSum(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length - 2; i++) {
            if (i == 0 || (i > 0 && array[i] != array[i - 1])) {
                int low = i + 1, high = array.length - 1, sum = 0 - array[i];
                //increase low if total less than 0, else decrease high
                //if total equals sum first, then increase both low and high
                //more conditions to generate all unique results
                while (low < high) {
                    if (array[low] + array[high] == sum) {
                        result.add(Arrays.asList(array[i], array[low], array[high]));
                        while (low < high && array[low] == array[low + 1])
                            low++;
                        while (low < high && array[high] == array[high - 1])
                            high--;
                        low++;
                        high--;
                    } else if (array[low] + array[high] < sum)
                        low++;
                    else high--;
                }
            }
        }
        return result;
    }
}