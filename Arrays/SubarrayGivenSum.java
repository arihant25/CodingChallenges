/**
 * Given an unsorted array A of size N of non-negative integers,
 * find a continuous sub-array which adds to a given number S
 *
 * @author Arihant Jain
 */

public class SubarrayGivenSum {
    public static void main(String[] args) {
        System.out.println(findSum(new int[]{1, 2, 3, 4, 6, 7, 9}, 15));
    }

    private static boolean findSum(int[] arr, int k) {
//        n^2 approach

//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if (sum == k) {
//                    return true;
//                }
//            }
//        }

//        sliding window

        int low = 0, high = 0, sum = arr[0];
        while (low < arr.length && high < arr.length - 1) {
            if (sum == k) {
                return true;
            }
            if (sum < k) {
                sum += arr[++high];
            } else {
                sum -= arr[low++];
            }
        }
        return false;
    }

}
