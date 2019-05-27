/**
 * Daily Coding Challenge
 * Given an array of numbers and an index i, return the index of the nearest larger number of the number at index i,
 * where distance is measured in array indices.
 *
 * For example, given [4, 1, 3, 5, 6] and index 0, you should return 3.
 *
 * If two distances to larger numbers are the equal, then return any one of them.
 * If the array at i doesn't have a nearest larger integer, then return null.
 *
 * Follow-up: If you can preprocess the array, can you do this in constant time?
 *
 * @author Arihant Jain
 */

public class NearestLargestNumber {
    public static void main(String[] args) {
        System.out.println(nearestLargest(new int[]{4, 1, 3, 5, 6}, 0));
    }

    private static Integer nearestLargest(int[] arr, int index) {
        int min = arr.length;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                if (min > i - index) {
                    min = i - index;
                }
            }
        }
        for (int i = index; i >= 0; i--) {
            if (arr[i] < arr[index]) {
                if (min > index - i) {
                    min = index - i;
                }
            }
        }
        if (min == arr.length)
            return null;
        return min;
    }
}
