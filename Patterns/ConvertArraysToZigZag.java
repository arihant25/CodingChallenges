import java.util.Arrays;

/**
 * Coding Challenge
 * To convert an array of numbers to the pattern a < b > c < d > e.
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Arihant Jain
 */

public class ConvertArraysToZigZag {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 6, 7, 1, 9};
        convertToZigZag(array);
        System.out.println(Arrays.toString(array));
    }

    private static void convertToZigZag(int[] array) {
//        simple approach, sort array and swap elements from i and i + 1 staring i = 1.
//        Arrays.sort(array);
//        for (int i = 1; i < array.length - 1; i+=2)
//            swap(array, i, i + 1);


//      modifying single pass in bubble sort.
        boolean next = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (next) {
                if (array[i] > array[i + 1])
                    swap(array, i, i + 1);

            } else if (array[i] < array[i + 1])
                swap(array, i, i + 1);

            next = !next;
        }

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
