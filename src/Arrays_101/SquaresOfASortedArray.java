package Arrays_101;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums)
                .map(n -> n * n)
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
}
