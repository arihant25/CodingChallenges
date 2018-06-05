/**
 * Coding Challenge
 * To find if elements in an array are consecutive.
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Arihant Jain
 */

public class CheckIfArrayElementsAreConsecutive {
    public static void main(String[] args) {
        CheckIfArrayElementsAreConsecutive check = new CheckIfArrayElementsAreConsecutive();
        System.out.println(check.checkCons(new int[]{4, 3, 6, 2, 5, 1}));
    }

    private boolean checkCons(int[] array) {
        int min = array[0];
        int max = array[0];

        //Find minimum from the array
        for (int i = 0; i < array.length; i++)
            if (min > array[i])
                min = array[i];

        //Find maximum from the array
        for (int i = 0; i < array.length; i++)
            if (max < array[i])
                max = array[i];

        //initial check
        if (max - min + 1 != array.length)
            return false;

        //subtract all numbers by the min value
        for (int i = 0; i < array.length; i++)
            array[i] -= min;

        //check if numbers are distinct
        for (int i = 0; i < array.length; i++) {
            if (array[Math.abs(array[i])] < 0)
                return false;
            array[Math.abs(array[i])] = -array[Math.abs(array[i])];
        }
        return true;
    }
}