import java.util.HashMap;

public class LargestSubArrayWithEqual0s1s {
    public static void main(String[] args) {

    }

    public static int largestSubarray(int[] array) {
        int difference = 0, count0 = 0, count1 = 0;
        HashMap<Integer, Integer> toCompare = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                count0++;
            else count1++;

            difference = count0 - count1;
            toCompare.put(i, difference);

        }
        return 0;
    }
}