package Arrays_101;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {


        int start = 0;
        int end = nums.length;

        while(start != end) {
            if(nums[start] % 2 == 1) {
                int temp = nums[start];
                nums[start] = nums[end - 1];
                nums[end - 1] = temp;
                end--;
            } else {
                start++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] arr = new int[] {3, 1, 2, 4};
        System.out.println(Arrays.toString(arr));

        sortArrayByParity.sortArrayByParity(arr);
        System.out.println(Arrays.toString(arr));

    }
}
