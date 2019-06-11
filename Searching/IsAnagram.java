/**
 * LeetcodeProblems
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * @author Arihant Jain
 */

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    private static boolean isAnagram(String s, String t) {
        int[] bucket = new int[26];
        for (int i = 0; i < s.length(); i++)
            bucket[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            bucket[t.charAt(i) - 'a']--;
        for (int i : bucket)
            if (i != 0) return false;
        return true;
    }
}
