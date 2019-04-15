/**
 * Leetcode Problems
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * @author Arihant Jain
 */

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return (s.equals(new StringBuffer(s).reverse().toString()));
    }
}
