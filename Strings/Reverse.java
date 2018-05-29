/**
 *CodingChallenge
 *To find the reverse of an integer.
 *
 *@author Arihant Jain
 */

class Solution {
    public int reverse(int x) {
        if (x >= 2147483647 || x <= -2147483647) 
            return 0;
        String rev = Integer.toString(Math.abs(x));
        StringBuilder temp = new StringBuilder(rev);
        rev = temp.reverse().toString();
        if(x>=0)
            return Integer.parseInt(rev);
        else return Integer.parseInt(rev) * (-1);
    }
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            int ret = new Solution().reverse(x);
            String out = String.valueOf(ret);
            System.out.print(out);
        }
    }
}