import java.util.HashSet;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * @author Arihant Jain
 */

public class FindIfSum {
    public static void main(String[] args) {
        System.out.println(isPresent(new int[]{10, 15, 3, 7}, 17));
    }

    private static boolean isPresent(int[] arr, int k) {
//        O(n^2) solution

//        int len = arr.length;
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < i; j++) {
//                if (arr[i] + arr[j] == k) {
//                    return true;
//                }
//            }
//        }
//        return false;


//        O(n) solution
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++)
            hashSet.add(arr[i]);

        for (int i = 0; i < arr.length; i++)
            if (hashSet.contains(k - arr[i]))
                return true;

        return false;
    }
}