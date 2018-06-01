/**
 *Cracking the coding interview
 *
 *Input will take a string.
 *To output, if the string has unique characters or not.
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 *
 *@author Arihant Jain
 *
 */

import java.util.Scanner;

public class UniqueString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(isUnique(string));
    }

    private static String isUnique(String input) {
        input = input.toLowerCase();
        String result = "All unique characters!";
        for (int i=0; i<input.length(); i++) {
            char test = input.charAt(i);
            for (int j=0; j<input.length(); j++) {
                if (i != j)
                    if (test == input.charAt(j)) {
                        result = "Characters not unique.";
                        return result;
                    }
            }
        }
        return result;
    }
}