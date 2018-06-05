/**
 *LeetCodeProblems
 *To find the longest common prefix from an array of Strings.
 *Can use 2D array for optimization
 *
 *@author Arihant Jain
 */

class LongestCommonPrefix {
    private static String longestCommonPrefix(String[] strs) {
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

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"ASFSAFS", "ADFASFS"}));
    }

}