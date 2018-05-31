/**
 *LeetCodeProblems
 *To add binary strings to return a binary string.
 *
 *@author Arihant Jain
 */

import java.math.*;

class Solution {
    public String addBinary(String a, String b) {
        return (new BigInteger(a, 2)).add(new BigInteger(b, 2)).toString(2);
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
            String a = stringToString(line);
            line = in.readLine();
            String b = stringToString(line);
            String ret = new Solution().addBinary(a, b);
            String out = (ret);            
            System.out.print(out);
        }
    }
}