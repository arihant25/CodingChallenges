/**
 * Daily Coding Challenge
 * Find an efficient algorithm to find the smallest distance (measured in number of words)
 * between any two given words in a string.
 *
 * For example, given words "hello", and "world" and a text content of "dog cat hello cat dog dog hello cat world",
 * return 1 because there's only one word "cat" in between the two words.
 *
 * @author Arihant Jain
 */

public class ShortestDistanceBetweenWords {
    public static void main(String[] args) {
        System.out.println(smallestDistance("dog cat hello cat dog dog hello cat world", "hello", "world"));
    }

    private static int smallestDistance(String words, String w1, String w2) {
        String[] strings = words.split(" ");
        int previous = 0, min = strings.length, index;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(w1)) {
                previous = i;
                break;
            }
        }
        index = previous + 1;
        while (index < strings.length) {
            if (strings[index].equals(w2)) {
                if (min > index - previous) {
                    min = index - previous;
                }
            }
            if (strings[index].equals(w1)) {
                previous = index;
            }
            index++;
        }
        return min - 1;
    }
}
