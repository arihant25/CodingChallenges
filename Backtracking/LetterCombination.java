import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombination {
    private List<String> res;
    private HashMap<Character, String> map = new HashMap<>();
    private String d;

    private List<String> letterCombinations(String digits) {
        d = digits;
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        res = new ArrayList<>();
        bt(0, "");
        return res;
    }

    private void bt(int n, String str) {
        if (n > d.length()) return;
        if (n == d.length()) {
            res.add(str);
            return;
        }
        String alp = map.get(d.charAt(n));
        for (int i = 0; i < 3; i++) {
            bt(n + 1, str + alp.charAt(i));
        }
    }

    public static void main(String[] args) {
        LetterCombination letterCombination = new LetterCombination();
        System.out.println(letterCombination.letterCombinations("23"));
        System.out.println(letterCombination.letterCombinations("234"));
    }
}
