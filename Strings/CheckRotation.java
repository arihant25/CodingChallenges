/**
 * Cracking the coding interview
 * Input are two strings.
 * To output, true if one string is the rotation of other using one call to isSubstring().
 *
 * @author Arihant Jain
 */

public class CheckRotation {
    public static void main(String[] args) {
        System.out.println(checkRotation("waterbottle", "erbottlewat"));
    }

    private static boolean checkRotation(String s1, String s2) {
        String temp = s2+s2;
        return (isSubstring(s1, temp));
    }

    private static boolean isSubstring(String s1, String s2) {
        return (s2.contains(s1));
    }
}