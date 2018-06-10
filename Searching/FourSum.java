/**
 * Coding Challenge
 * To find all unique 4 elements that add up that equals to the target.
 * Time complexity: O(n^3)
 * Space complexity: O(1)
 *
 * @author Arihant Jain
 */

import java.util.Arrays;
import java.util.HashSet;

public class FourSum {
    public static void main(String[] args) {
        HashSet<String> result = fourSum(new int[]{1, 1, 4, 5, 9, 11}, 21);
        for (String i : result)
            System.out.println(i);
    }

    private static HashSet<String> fourSum(int[] array, int target) {
        Arrays.sort(array);
        HashSet<String> hs = new HashSet<>();

        //similar implementation as three sum
        for (int i = 0; i < array.length - 3; i++)
            for (int j = i + 1; j < array.length - 2; j++) {
                int low = j + 1;
                int high = array.length - 1;

                while (low < high) {
                    if (array[i] + array[j] + array[low] + array[high] == target) {
                        String addFour = array[i]+ ", "+ array[j]+ ", "+ array[low]+ ", "+ array[high];
                        hs.add(addFour);
                        while (low < high && array[low] == array[low + 1])
                            low++;
                        while (low < high && array[high] == array[high - 1])
                            high--;
                        low++;
                        high--;
                    }

                    else if (array[i] + array[j] + array[low] + array[high] < target)
                        low++;

                    else high--;
                }
            }
        return hs;
    }
}