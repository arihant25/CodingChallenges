import java.util.HashSet;

/**
 *CodingChallenge
 *To find the length of the longest substring in a string.
 *
 *@author Arihant Jain
 */

class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
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

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("ASFSAFS"));
    }
}