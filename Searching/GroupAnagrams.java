import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetcodeProblems
 * Given an array of strings, group anagrams together.
 *
 * @author Arihant Jain
 */

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        List<String> list = Arrays.asList(strs);
        ArrayList<String> arrayList = new ArrayList<>(list);
        List<List<String>> result = new ArrayList<>();
        while (arrayList.size() != 0) {
            String s = arrayList.get(0);
            List<String> tempList = new ArrayList<>();
            for (String t : arrayList) {
                if (isAnagram(s, t)) {
                    tempList.add(t);
                }
            }
            arrayList.removeAll(tempList);
            result.add(tempList);
        }
        return result;

    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        if (s.length() == 0) {
            return true;
        }
        int[] bucket = new int[26];
        for (int i = 0; i < s.length(); i++) {
            bucket[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            bucket[t.charAt(i) - 'a']--;
        }
        for (int i : bucket) {
            if (i != 0) return false;
        }
        return true;
    }
}
