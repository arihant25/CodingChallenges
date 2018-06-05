import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/**
 *LeetCodeProblems
 *To check the validity of a given string of char brackets.
 *
 *@author Arihant Jain
 */

public class ParenthesesIsValid {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return input.toString();
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);

            System.out.print(isValid(s));
        }
    }

    public static boolean isValid(String s) {
        String[] sArray = s.split("");
        if (s.equals(""))
            return true;
        if (sArray.length == 1)
            return false;
        Deque deque = new LinkedList<>();
        for (int i=0; i<sArray.length; i++) {
            if (deque.size()!=0 && ((deque.peek().equals("(") && sArray[i].equals(")")) ||
                    (deque.peek().equals("{") && sArray[i].equals("}")) || (deque.peek().equals("[") && sArray[i].equals("]"))))
                deque.pop();
            else deque.push(sArray[i]);
        }
        if (deque.size()==0)
            return true;
        else return false;
    }
}
