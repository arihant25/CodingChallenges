/**
 *LeetcodeChallenge
 *To find if the sentence string is a palindrome.
 *
 *@author Arihant Jain
 */

public class CheckIfASentenceIsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("IS...!IT??tisi"));
    }

    private static boolean isPalindrome(String s) {
        if (s.length() == 0)
            return true;
        String temp;
        temp = s.replaceAll("[^a-zA-Z0-9]", "");
        temp = temp.toLowerCase();
        if (temp.equals(new StringBuilder(temp).reverse().toString()))
            return true;
        else return false;
    }
}
