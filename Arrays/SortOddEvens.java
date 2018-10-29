public class SortOddEvens {
    public static void main(String[] args) {
        int[] array = evenOdd(new int[]{3, 4, 2, 4, 5, 1, 9, 8});
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    private static int[] evenOdd(int[] array) {
        int evenpointer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (evenpointer != i) {
                    int temp = array[evenpointer];
                    array[evenpointer] = array[i];
                    array[i] = temp;
                    evenpointer++;
                }
            }
        }
        return array;
    }
}
