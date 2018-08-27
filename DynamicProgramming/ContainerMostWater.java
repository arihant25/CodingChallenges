/**
 * LeetCodeProblems
 * To find the area where the most quantity of water can be stored.
 * Given an array a1,..,an where each line has end points (i,0) and (i,ai).
 * Time complexity: O(n^2)
 * Note: To add dynamic programming solution.
 *
 * @author Arihant Jain
 */

public class ContainerMostWater {
    public static void main(String[] args) {
        maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }

    private static int maxArea(int heights[]) {
        int max = -1;
        for (int j = 0; j < heights.length; j++)
            for (int i = 0; i < heights.length; i++) {
                int area = -1;
                if (i != j)
                    if (heights[j] > heights[i])
                        area = Math.abs((i - j) * heights[i]);
                    else area = Math.abs((i - j) * heights[j]);
                if (max < area)
                    max = area;
            }
        System.out.println("The maximum water contained = " + max);
        return max;
    }
}
