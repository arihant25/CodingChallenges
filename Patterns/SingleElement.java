import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * LeetCodeProblems
 * To find the element that occurs exactly once.
 * Given a non-empty array of integers, every element appears twice except for one.
 * Time complexity: O(n)
 *
 * @author Arihant Jain
 */

public class SingleElement {
    public static void main(String[] args) {
        System.out.println(singleNumberHashMap(new int[]{4, 1, 2, 1, 2}));
    }

//    Hashmap implementation to find the element.
    private static int singleNumberHashMap(int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!hashMap.containsKey(array[i]))
                hashMap.put(array[i], 0);
            else hashMap.put(array[i], 1);
        }
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if (Integer.parseInt(pair.getValue().toString()) == 0)
                return Integer.parseInt(pair.getKey().toString());
        }
        return 0;
    }

//    XORing number with itself is 0 and by XORing all by elements, the element occurring once is retained.
    private static int singleNumberXOR(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++)
            answer = answer ^ array[i];
        return answer;
    }
}