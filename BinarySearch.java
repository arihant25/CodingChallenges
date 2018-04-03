import java.util.Scanner;

/**
 * Coding Challenge
 * Binary Search recursive implementation.
 *
 * @author Arihant Jain
 */

public class BinarySearch {
    /**
     * This is the primary driver code.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int count = scanner.nextInt();
        int[] array = new int[count];

        System.out.println("Enter the numbers for your array:");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter element to find:");
        int find = scanner.nextInt();

        sortArray(array);
        if (binarySearch(array, 0, array.length-1, find))
            System.out.printf("Element " + find + " is present in the array.");
        else
            System.out.printf("Element " + find + " is not present in the array.");
    }

    /**
     * This function sorts the array using bubble sort.
     * @param array - user array input
     * @return sorted array is returned
     */
    private static int[] sortArray(int[] array) {
        for (int i=0; i<array.length-1; i++) {
            for (int j=0; j<array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * This is the binary search function.
     * @param array - sorted user array input
     * @param left - left bound for the array
     * @param right - right bound for the array
     * @param find - element to find in the array
     * @return
     */
    private static boolean binarySearch(int[] array, int left, int right, int find) {

        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (find == array[mid])
                return true;

            if (mid < find) {
                binarySearch(array, mid + 1, right, find);
            } else {
                binarySearch(array, left, mid - 1, find);
            }
        }
        return false;
    }
}