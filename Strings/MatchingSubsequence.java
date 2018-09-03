/**
 * LeetCodeProblems
 * To find the number of words that are subsequences of a given string.
 * Given an array with string of words w1,..,wn.
 *
 * @author Arihant Jain
 */

public class MatchingSubsequence {
    private static int numMatchingSubsequence(String s, String[] words) {
        int answer = 0;
        char[] seperate = s.toCharArray();
        for (String S : words)
            if (isSubseq(S, seperate))
                answer++;
        return answer;
    }

    private static boolean isSubseq(String s, char[] seperateString) {
        char[] seperateWord = s.toCharArray();
        int i = 0, j = 0;
        while (i < seperateString.length) {
            if (seperateWord[j] == seperateString[i]) {
                j++;
                if (j == seperateWord.length)
                    return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(numMatchingSubsequence("abcde", new String[]{"a", "bb", "acd", "ace"}));
    }
}

