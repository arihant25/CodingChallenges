import java.util.Scanner;

public class RangeQuerySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int count = scanner.nextInt();
        int[] array = new int[count];

        System.out.println("Enter the numbers for your array:");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the range:");
        int left = scanner.nextInt();
        int right = scanner.nextInt();

        System.out.printf("The sum for the given range is " + rangeSum(array, left, right) + ".");
    }

    public static int rangeSum(int array[], int left, int right) {
        int sum = 0;
        for (int i=left; i<=right; i++) {
            sum += array[i];
        }
        return sum;
    }
}
