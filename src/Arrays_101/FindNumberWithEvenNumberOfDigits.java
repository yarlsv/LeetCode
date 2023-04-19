package Arrays_101;

import java.util.Arrays;

public class FindNumberWithEvenNumberOfDigits {

    public static int findNumbers(int[] nums) {
        return (int) Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .filter(n -> n.length() % 2 == 0)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[] {12, 345, 2, 6, 7896}));
    }
}
