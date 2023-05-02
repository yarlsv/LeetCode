package easy;

import java.util.Arrays;

public class SignOfTheProductOfAnArray {

    public int arraySign(int[] nums) {
        int product = Arrays.stream(nums)
                .map(this::signFunc)
                .reduce(1, (a ,b) -> a * b);
        return signFunc(product);
    }

    public int signFunc(int number) {

        if(number > 0) {
            return 1;
        }

        if (number < 0) {
            return -1;
        }
        return 0;
    }
}
