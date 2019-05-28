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

public class MinimumNumberCoins {
    public static void main(String[] args) {
        System.out.println(minimumCoins(16));
        System.out.println(minimumCoins(30));
        System.out.println(minimumCoins(11));
    }

//    solved using greedy algorithm
//    note: this will not work for all denominations, for ex. {1, 5, 6, 9} with input 11
//    to solve using dynamic programming
    private static int minimumCoins(int totalCents) {
        int count = 0, tempCents = 0;
        int[] denominations = new int[]{1, 5, 10, 25};
        for (int i = 3; i >= 0; i--) {
            while (tempCents + denominations[i] <= totalCents) {
                tempCents = tempCents + denominations[i];
                count++;
            }
            if (tempCents == totalCents) {
                break;
            }
        }
        return count;
    }
}
