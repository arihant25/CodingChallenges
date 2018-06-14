public class CommonInThreeSortedArray {
    public static void main(String[] args) {
        int input1[] = {1, 5, 10, 20, 40, 80};
        int input2[] = {6, 7, 20, 80, 100};
        int input3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        CommonInThreeSortedArray commonInThreeSortedArray = new CommonInThreeSortedArray();
        commonInThreeSortedArray.findCommon(input1, input2, input3);
    }

    private void findCommon(int[] array1, int[] array2, int[] array3) {
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length && k < array3.length) {
            if (array1[i] == array2[j] && array2[j] == array3[k]) {
                System.out.println(array1[i]);
                i++;
                j++;
                k++;
            } else if (array1[i] < array2[j])
                i++;
            else if (array2[j] < array3[k])
                j++;
            else k++;
        }
    }
}