/**
 * Coding Challenge
 * To find the shortest distance between two numbers.
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Arihant Jain
 */

public class ShortestDistanceBetweenTwoNumbers {
    public static void main(String[] args) {
        System.out.println(sDis(new int[]{3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3}, 3, 6));
    }

    private static int sDis(int[] array, int x, int y) {
        int answer = Integer.MAX_VALUE;
        int answer2 = Integer.MAX_VALUE;
        int temp = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                temp = i;
            if (temp != -1 && array[i] == y && i - temp < answer)
                answer = i - temp;
        }

        temp = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == y)
                temp = i;
            if (temp != -1 && array[i] == x && i - temp < answer2)
                answer2 = i - temp;
        }

        if (answer > answer2)
            return answer2;
        else return answer;
    }
}