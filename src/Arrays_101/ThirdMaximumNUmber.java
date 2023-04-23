package Arrays_101;

import java.util.Arrays;

public class ThirdMaximumNUmber {

    public int thirdMax(int[] nums) {

        Object[] newArr = Arrays.stream(nums)
                .distinct()
                .sorted()
                .boxed()
                .toArray();

        return (int) (newArr.length >= 3 ? newArr[newArr.length - 3] : newArr[newArr.length - 1]);
    }

    public static void main(String[] args) {
        ThirdMaximumNUmber thirdMaximumNUmber = new ThirdMaximumNUmber();
        int[] arr = new int[] {3, 2, 1};
        System.out.println(Arrays.toString(arr));

        System.out.println(thirdMaximumNUmber.thirdMax(arr));

    }
}
