import java.util.Scanner;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println("Input the two strings: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("The longest common subsequence between the two input strings is: " + lCS(scanner.nextLine(), scanner.nextLine()));
    }

    private static int lCS(String str1, String str2) {
        String[] s1 = str1.split("");
        String[] s2 = str2.split("");
        int[][] lcs = new int[s1.length + 1][s2.length + 1];

        for (int i = 0; i <= s1.length; i++)
            for (int j = 0; j <= s2.length; j++) {
                if (i == 0 || j == 0)
                    lcs[i][j] = 0;
                else if (s1[i - 1].equals(s2[j - 1]))
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                else lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
            }
        return lcs[s1.length][s2.length];
    }
}