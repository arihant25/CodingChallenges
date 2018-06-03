/**
 * CodingChallenge
 * To find the edit distance for one string to convert one input to second input using dynamic programming.
 *
 * @author Arihant Jain
 */

import java.util.Scanner;

public class EditDistance {
    public static void main(String[] args) {
        System.out.println("Input the two strings: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("The edit distance between the two input strings is: " + eDistance(scanner.nextLine(), scanner.nextLine()));
    }

    private static int eDistance(String str1, String str2) {
        String str1Arr[] = str1.split("");
        String str2Arr[] = str2.split("");
        int[][] eDis = new int[str2Arr.length + 1][str1Arr.length + 1];
        //initialization of the top row and right column.
        for (int i = 0; i < str2Arr.length; i++)
            for (int j = 0; j < str1Arr.length; j++) {
                if (i == 0)
                    eDis[i][j] = j;
                if (j == 0)
                    eDis[i][j] = i;
            }
        for (int i = 1; i <= str2Arr.length; i++)
            for (int j = 1; j <= str1Arr.length; j++) {
                if (str1Arr[j - 1].equals(str2Arr[i - 1]))
                    eDis[i][j] = eDis[i - 1][j - 1];
                else
                    eDis[i][j] = Math.min(Math.min(eDis[i - 1][j], eDis[i][j - 1]), eDis[i - 1][j - 1]) + 1;
            }
        return eDis[str2Arr.length][str1Arr.length];
    }
}