/**
 * Daily Coding Challenge
 * Find the minimum number of coins required to make n cents.
 *
 * You can use standard American denominations, that is, 1¢, 5¢, 10¢, and 25¢.
 *
 * For example, given n = 16, return 3 since we can make it with a 10¢, a 5¢, and a 1¢.
 *
 * @author Arihant Jain
 */

public class MinimumCoins {
    public static void main(String[] args) {
        System.out.println(getMinimumCoins(11, new int[]{1, 5, 6, 8}));
        System.out.println(getMinimumCoins(16, new int[]{1, 2, 5, 10, 25}));
        System.out.println(getMinimumCoins(11, new int[]{1, 5, 6, 9}));
    }

    private static int getMinimumCoins(int totalCents, int[] denominations) {
        int[][] arr = new int[denominations.length + 1][totalCents + 1];
        for (int i = 0; i <= totalCents; i++) {
            arr[0][i] = i;
        }
        for (int i = 1; i <= denominations.length; i++) {
            for (int j = 0; j <= totalCents; j++) {
                if (j >= denominations[i - 1])
                    arr[i][j] = Integer.min(arr[i - 1][j], 1 + arr[i][j - denominations[i - 1]]);
                else arr[i][j] = arr[i - 1][j];
            }
        }
        return arr[denominations.length][totalCents];
    }
}
