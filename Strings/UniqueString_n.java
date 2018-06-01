/**
 *Cracking the coding interview
 *
 *Input will take a string.
 *To output, if the string has unique characters or not.
 * Time complexity: O(n)
 * Space complexity: O(n)
 *
 *@author Arihant Jain
 *
 */

import java.util.Scanner;

public class UniqueString_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if(isUnique(string))
            System.out.println("All unique characters!");
        else
            System.out.println("No unique characters.");
    }

    private static boolean isUnique(String input) {
        input = input.toLowerCase();
        boolean arr[] = new boolean[256];
        for (int i=0; i<input.length(); i++) {
            int test = input.charAt(i);
            if (arr[test]) return false;
            arr[test] = true;
        }
        return true;
    }
}