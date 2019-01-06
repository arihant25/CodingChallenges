/**
 * CodingChallenge
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message.
 * Count the number of ways it can be decoded.
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Arihant Jain
 */

public class EncodedCount {
    public static void main(String[] args) {
        System.out.println(getCount(111));
    }

    private static int getCount(int number) {
        int[] arr = numToArr(number);
        int[] count = new int[arr.length + 1];
        count[0] = 1;
        count[1] = 1;
        for (int i = 2; i <= arr.length; i++) {
            count[i] = 0;
            if (arr[i - 1] > 0)
                count[i] = count[i - 1];
            if ((arr[i - 2] == 2 && arr[i - 1] < 7) || arr[i - 2] == 1)
                count[i] = count[i] + count[i - 2];
        }
        return count[arr.length];
    }


    private static int[] numToArr(int number) {
        String string = Integer.toString(number);
        String[] strArray = string.split("");
        int[] array = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++)
            array[i] = Integer.parseInt(strArray[i]);
        return array;
    }
}
