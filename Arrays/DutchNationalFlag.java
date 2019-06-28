import java.util.Arrays;

/**
 * Dutch national flag problem.
 *
 * @author Arihant Jain
 */

public class DutchNationalFlag {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortFlag(new int[]{2, 0, 0, 1, 2, 1})));
        System.out.println(Arrays.toString(sortFlag(new int[]{0, 1, 2, 0, 1, 2})));
        System.out.println(Arrays.toString(sortFlag(new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1})));
    }

    private static int[] sortFlag(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low++, mid++);
            } else if (arr[mid] == 2) {
                swap(arr, mid, high--);
            } else mid++;
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
