import java.util.HashSet;

/**
 * Leetcode Problems
 * To find the first missing positive integer in an array.
 * Time complexity: O(n)
 * Space complexity: O(n)
 *
 * @author Arihant Jain
 */


public class FirstMissingPostive {
    public static void main(String[] args) {
        System.out.println(missingPositive(new int[]{3, 4, -1, 1}));
    }

    private static int missingPositive(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : array)
            hashSet.add(i);
        boolean flag = true;
        int start = 1;
        while (flag) {
            if (!hashSet.contains(start))
                return start;
            start++;
        }
        return 0;
    }
}
