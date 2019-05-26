import java.util.Scanner;

/**
 * Daily Coding Challenge
 * Given a string, return the first recurring character in it, or null if there is no recurring character.
 * <p>
 * For example, given the string "acbbac", return "b". Given the string "abcdef", return null.
 *
 * @author Arihant Jain
 */

public class FirstRecurringElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        System.out.println(findFirstRecurring(scanner.nextLine()));
    }

    private static String findFirstRecurring(String string) {
        char[] chars = string.toCharArray();
        boolean[] booleans = new boolean[256];
        for (char c : chars) {
            if (!booleans[c]) {
                booleans[c] = true;
            } else return String.valueOf(c);
        }
        return null;
    }
}
