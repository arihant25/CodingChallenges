import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * LeetCodeProblems
 * To find the median from two sorted arrays.
 *
 * @author Arihant Jain
 */


public class FindMedianSortedArrays {
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


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums1 = stringToIntegerArray(line);
            line = in.readLine();
            int[] nums2 = stringToIntegerArray(line);
            System.out.print(findMedianSortedArrays(nums1, nums2));
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                nums3[k++] = nums1[i];
                i++;
            } else {
                nums3[k++] = nums2[j];
                j++;
            }
        }
        while (i < nums1.length) {
            nums3[k++] = nums1[i];
            i++;
        }
        while (j < nums2.length) {
            nums3[k++] = nums2[j];
            j++;
        }
        if (nums3.length % 2 != 0)
            return nums3[nums3.length / 2];
        else return (nums3[nums3.length / 2] + nums3[(nums3.length / 2) - 1]) / 2.0;
    }

}