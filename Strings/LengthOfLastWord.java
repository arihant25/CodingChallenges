/**
 *LeetCodeProblems
 *To find the length of the last word in a string.
 *
 *@author Arihant Jain
 */

class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] spl = s.split(" ");
        if (s.replaceAll("\\s","").equals(""))
            return 0;
        return spl[spl.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("To find the length of the last word in a string."));
    }
}