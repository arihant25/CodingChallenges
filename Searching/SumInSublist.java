import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Daily Coding Challenge
 * Given a list of numbers L, implement a method sum(i, j)
 * which returns the sum from the sublist L[i:j] (including i, excluding j).
 *
 * For example, given L = [1, 2, 3, 4, 5], sum(1, 3) should return sum([2, 3]), which is 5
 *
 * You can assume that you can do some pre-processing. sum() should be optimized over the pre-processing step.
 *
 * @author Arihant Jain
 */

public class SumInSublist {
    private static HashMap<Integer, Long> hashMap = new HashMap<>();

    static {
        int i = 0;
        long sum = 0L;
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer a : arrayList) {
            hashMap.put(i++, sum = sum + a);
        }
    }

    private static long sum(int i, int j) {
        return hashMap.get(j - 1) - hashMap.get(i - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 3));
    }
}
