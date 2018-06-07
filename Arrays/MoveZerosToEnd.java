/**
 * Coding Challenge
 * To move all zeros in an array to the very last.
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Arihant Jain
 */

//another implementation to num down operations would be to overwrite on the zeros and add them later.
public class MoveZerosToEnd {
    public static void main(String[] args) {
        MoveZerosToEnd moveZerosToEnd = new MoveZerosToEnd();
        int[] array = {1, 0, 1, 2, 0, 5, 6, 7, 0};
        moveZerosToEnd.moveZeros(array);
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    //simply swap zeros with the next non zero element
    private void moveZeros(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] != 0)
                swap(array, i, temp++);
    }

    private void swap(int[] array, int i, int j) {
        int c = array[i];
        array[i] = array[j];
        array[j] = c;
    }
}