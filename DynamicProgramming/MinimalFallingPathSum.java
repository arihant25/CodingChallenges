public class MinimalFallingPathSum {
    public static void main(String[] args) {
        System.out.println(minFallingPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    private static int minFallingPathSum(int[][] A) {
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                int min = Integer.MAX_VALUE;
                if (j != 0) {
                    min = Math.min(min, A[i - 1][j - 1]);
                }
                min = Math.min(min, A[i - 1][j]);
                if (j != A[0].length - 1) {
                    min = Math.min(min, A[i - 1][j + 1]);
                }
                A[i][j] = A[i][j] + min;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < A[0].length; i++) {
            ans = Math.min(ans, A[A.length - 1][i]);
        }
        return ans;
    }
}
