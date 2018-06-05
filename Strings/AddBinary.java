/**
 * LeetCodeProblems
 * To add binary strings to return a binary string.
 *
 * @author Arihant Jain
 */

import java.math.*;

class AddBinary {
    public static String addBinary(String a, String b) {
        return (new BigInteger(a, 2)).add(new BigInteger(b, 2)).toString(2);
    }

    public static void main(String[] args) {
        System.out.println(addBinary("100101101", "100010001"));
    }
}
