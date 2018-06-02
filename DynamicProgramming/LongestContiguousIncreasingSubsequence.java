public class LongestContiguousIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 5, 4, 7, 8, 10, 10, 11};
        System.out.println(lCIS(arr));
    }

    private static int lCIS(int[] arr) {
        int[] temp = new int[arr.length];
        temp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                temp[i] = Math.max(temp[i - 1]++, temp[i - 1]);
            else temp[i] = 1;
        }
        int answer = 0;
        for (int i = 0; i < temp.length; i++) {
            if (answer < temp[i])
                answer = temp[i];
        }
        return answer;
    }
}