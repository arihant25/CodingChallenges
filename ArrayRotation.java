import java.util.Scanner;

/**
 * Coding Challenge
 * To rotate elements in an array
 *
 * @author Arihant Jain
 */

public class ArrayRotation {
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
            rotations = rotations%array.length;
        }

        rotateArray(array, rotations);
    }

    private static void rotateArray(int[] array, int rotations) {
        int [] rotatedArray = new int[array.length];
        int start=0;
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

    private static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}