package Linear;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1,},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int target = 34;
        int[] answer = getTheTargetFrom2D(arr, target);
        System.out.println(Arrays.toString(answer));

        int max = getTheMAXFrom2D(arr);
        System.out.println(max);

        int min = getTheMINFrom2D(arr);
        System.out.println(min);

    }

    private static int[] getTheTargetFrom2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    private static int getTheMAXFrom2D(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int elements : row) {
                if (elements > max) {
                    max = elements;
                }
            }
        }
        return max;
    }
    private static int getTheMINFrom2D(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] row : arr) {
            for (int elements : row) {
                if (elements < min) {
                    min = elements;
                }
            }
        }
        return min;
    }
}
