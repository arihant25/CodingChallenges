/**
 * CodingChallenge
 *To find the missing letters for a pangram.
 *
 *@author Arihant Jain
 */
import java.util.Scanner;

public class MissingLetters {
    /**
     * This is the primary driver code.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your pangram:");
        String test = scanner.nextLine();
        System.out.println("These letters were missing from your pangram:");
        checkPangram(test);
    }
    /**
     * Checks the letters missing from the pangram.
     * @param test - input string from the user
     */
    private static void checkPangram(String test){
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        test = test.toLowerCase();
        char[] alphabetArray = alphabets.toCharArray();
        char[] testArray = test.toCharArray();

        for (int i=0; i<alphabetArray.length; i++) {
            char testing = alphabetArray[i];
            boolean printChar = true;
            for (int j=0; j<testArray.length; j++) {
                if (testing == testArray[j]) {
                    printChar = false;
                }
            }
            if (printChar) {
                System.out.print(testing);
            }
        }
    }
}
