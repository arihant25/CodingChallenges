public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println( "The LIC for the input array is: " +lIC(new int[]{10, 22, 9, 33, 21, 50, 41, 60}));
    }

    private static int lIC(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < temp.length; i++)
            temp[i] = 1;
        for (int i = 1; i < arr.length; i++)
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && temp[j] + 1 > temp[i])
                    temp[i] = temp[j] + 1;
            }
        int answer = 0;
        for (int i = 0; i < temp.length; i++)
            if (answer < temp[i])
                answer = temp[i];

        return answer;
    }
}