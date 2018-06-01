/**
 *Cracking the coding interview
 *
 *Input will take a string.
 *To output, a reverse C-Style String.
 * Since C-Style pointers do not exist in Java, it is a simple string reversal program.
 * Time complexity: O(n)
 * Space complexity: O(n)
 *
 *@author Arihant Jain
 *
 */

import java.util.Scanner;

public class ReverseCString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(reverse(string));
    }

    private static String reverse(String input) {
        String rev = "";
        for (int i=input.length()-1; i>=0; i--) {
            rev = rev.concat(Character.toString(input.charAt(i)));
        }
        return rev;
    }
}
