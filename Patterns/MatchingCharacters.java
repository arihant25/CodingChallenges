import java.util.HashMap;

/**
 * CodingChallenge
 * To find if the number of words that can be generated using a given string.
 * Given an array of words w1,..,wn and string s.
 *
 * @author Arihant Jain
 */

public class MatchingCharacters {
    private static int numMatchingCharacters(String s, String[] words) {
        int answer = 0;
        String[] seperate = s.split("");

        for (int i = 0; i < words.length; i++) {
            String[] temp = words[i].split("");
            HashMap<String, Integer> hashMap = new HashMap<>();
            boolean flag = true;

            for (int k = 0; k < seperate.length; k++) {
                int count = hashMap.containsKey(seperate[k]) ? hashMap.get(seperate[k]) : 0;
                hashMap.put(seperate[k], count + 1);
            }

            for (int j = 0; j < temp.length; j++) {
                if (!hashMap.containsKey(temp[j])) {
                    flag = false;
                    break;
                }
                if (hashMap.containsKey(temp[j]))
                    hashMap.put(temp[j], hashMap.get(temp[j]) - 1);
                if (hashMap.get(temp[j]) == 0)
                    hashMap.remove(temp[j]);
            }
            if (flag)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(numMatchingCharacters("abcaabde", new String[]{"acd", "a", "babt", "ace"}));
    }
}