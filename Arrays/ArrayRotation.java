import java.util.Scanner;

/**
 * Coding Challenge
 * To rotate elements in an array
 *
 * @author Arihant Jain
 */

public class ArrayRotation {
    /**
     * This is the primary driver code.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int count = scanner.nextInt();
        int[] array = new int[count];

        System.out.println("Enter the numbers for your array:");
        for (int i=0; i<count; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter number of rotations:");
        int rotations = scanner.nextInt();
        if (rotations > array.length) {
            rotations = rotations % array.length;
        }

        rotateArray(array, rotations);
    }

    /**
     * Creates the rotated array.
     * @param array - Array input by user
     * @param rotations - Number of rotations for the array
     */
    private static void rotateArray(int[] array, int rotations) {
        int [] rotatedArray = new int[array.length];
        int start = 0;
        for (int i=0; i<array.length; i++) {
            if (i+rotations < array.length) {
                rotatedArray[i + rotations] = array[i];
            }
            else {
                rotatedArray[start] = array[i];
                start++;
            }
        }
        System.out.println("The rotated array is:");
        printArray(rotatedArray);
    }

    /**
     * Prints an array.
     * @param array - Array to print
     */
    private static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
