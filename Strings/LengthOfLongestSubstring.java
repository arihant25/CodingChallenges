/**
 *CodingChallenge
 *To find the length of the longest substring in a string.
 *
 *@author Arihant Jain
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        if(s.length()>0) {
            String[] temp = s.split("");
            char[] main = s.toCharArray();
            for(int i = 0; i<temp.length; i++){
                int max = 0;
                HashSet<String> check = new HashSet<>();
                for(int j=i; j<temp.length; j++){
                    if(!check.add(temp[j]))
                        break;
                    max++;        
                }
                if(max > answer)
                    answer = max;
            }
        }
        return answer;
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
            int ret = new Solution().lengthOfLongestSubstring(s);
            String out = String.valueOf(ret);
            System.out.print(out);
        }
    }
}
