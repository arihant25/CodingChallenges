/**
 * LeetCodeProblems
 * To find a certain pattern that occurs at the given number.
 * Pattern is to count and say - 1, 11, 21, 1211, 111221, 312211, 13112221...
 * Time complexity: O(n^2)
 *
 * @author Arihant Jain
 */

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }

    private static String countAndSay(int n) {
        if (n == 1)
            return "1";
        String temp = "11";
        for (int j = 1; j < n - 1; j++) {
            String[] arr = temp.split("");
            temp = "";
            int[] array = new int[arr.length];

            for (int i = 0; i < arr.length; i++)
                array[i] = Integer.parseInt(arr[i]);

            for (int i = 0; i < array.length; i++) {
                int count = 1;
                if (i < array.length - 1)
                    while (array[i] == array[i + 1]) {
                        count++;
                        i++;
                        if (i == array.length - 1)
                            break;
                    }
                temp = temp + count + array[i];
            }
        }
        return temp;
    }
}