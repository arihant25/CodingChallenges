/**
 *LeetCodeProblems
 *To find the needle string from the string haystack.
 *
 *@author Arihant Jain
 */

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals(""))
            return 0;
        String[] hay = haystack.split("");
        String[] ne = needle.split("");
        int len = ne.length;
        if (len>hay.length)
            return -1;
        for (int i=0; i<hay.length-len+1; i++) {
            if (ne[0].equals(hay[i])) {
                int count = 0;
                for (int j=i; j<i+len; j++)
                    if (ne[j-i].equals(hay[j]))
                        count++;
                if (count == len)
                    return i;
            }
        }
        return -1;
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
            String haystack = stringToString(line);
            line = in.readLine();
            String needle = stringToString(line);
            int ret = new Solution().strStr(haystack, needle);
            String out = String.valueOf(ret);
            System.out.print(out);
        }
    }
}