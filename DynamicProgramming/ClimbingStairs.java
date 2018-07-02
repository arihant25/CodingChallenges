/**
 *LeetCodeProblems
 *To find the number of ways to climb n steps by only jumping 1 or 2 steps.
 *
 *@author Arihant Jain
 */

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(numberWays(10));
    }

    private static int numberWays(int num) {
        if (num <= 2)
            return num;

        int arr[] = new int[num + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= num; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        return arr[num];
    }
}