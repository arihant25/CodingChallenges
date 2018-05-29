/**
 *LeetCodeProblems
 *To find the longest common prefix from an array of Strings.
 *Can use 2D array for optimization 
 *
 *@author Arihant Jain
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        if (strs.length == 0)
            return "";
        int min = strs[0].length();
        for (int j = 0; j<strs.length; j++) {
            if(min > strs[j].length())
                min = strs[j].length();
        }
        for (int j = 0; j<min; j++) {
            int count = 0;
            String compare = strs[0].split("")[j];
            for (int i = 0; i< strs.length;i++) {
                String[] temp = strs[i].split("");
                if (compare.equals(temp[j]))
                    count++;
                else break;
            }
            if (count == strs.length)
                answer = answer + strs[0].split("")[j];
            else break;
        }
        return answer;
    }
}

public class MainClass {
    public static String[] stringToStringArray(String input) {
        JsonArray jsonArray = JsonArray.readFrom(line);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = jsonArray.get(i).asString();
      }
      return arr;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while ((line = in.readLine()) != null) {
        String[] strs = stringToStringArray(line);
        String ret = new Solution().longestCommonPrefix(strs);
        String out = (ret);
        System.out.print(out);
    }
}
}