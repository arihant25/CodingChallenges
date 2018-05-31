/**
 *LeetCodeProblems
 *To find the length of the last word in a string.
 *
 *@author Arihant Jain
 */

class Solution {
    public int lengthOfLastWord(String s) {
        String[] spl = s.split(" ");
        if (s.replaceAll("\\s","").equals(""))
            return 0;
        return spl[spl.length-1].length();
    }
}

public class MainClass {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return Json.value(input).toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            int ret = new Solution().lengthOfLastWord(s);
            String out = String.valueOf(ret);            
            System.out.print(out);
        }
    }
}