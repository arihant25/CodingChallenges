/**
 *LeetCodeProblems
 *To find the atoi integer.
 *
 *@author Arihant Jain
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;

public class MyAtoi {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return input.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String str = stringToString(line);
            System.out.print(myAtoi(str));
        }
    }

    public static int myAtoi(String str) {
        String str1 = str;
        str1 = str1.replaceAll("\\s","");
        String[] sArray = str1.split("");
        if (sArray.length == 1 && (sArray[0].equals("-") || sArray[0].equals("+")))
            return 0;
        String temp = "";
        int len = numbers(str);
        if (len == 0 || ( len==1 && sArray[0].equals("+")) || ( len==1 && sArray[0].equals("-")))
            return 0;
        for (int i=0; i<len; i++)
            temp = temp + sArray[i];
        BigInteger num = new BigInteger(temp);
        if (num.compareTo(BigInteger.valueOf(2147483647)) > 0 || num.compareTo(BigInteger.valueOf(-2147483648)) <= 0) {
            if (num.compareTo(BigInteger.valueOf(2147483647)) > 0)
                return 2147483647;
            else
                return -2147483648;
        }
        else return Integer.parseInt(temp);
    }

    private static int numbers(String str) {
        String[] sArray = str.split("");
        int count = 0;
        boolean flag = true;
        for(int i=0;i<sArray.length;i++) {
            if (((sArray[i].equals("-") || sArray[i].equals("+")) && flag) || sArray[i].matches("[0-9]") || (sArray[i].matches("\\s")) && flag) {
                if(!sArray[i].matches("\\s")) {
                    flag =false;
                    count++;
                }
            }
            else return count;
        }
        return count;
    }
}
