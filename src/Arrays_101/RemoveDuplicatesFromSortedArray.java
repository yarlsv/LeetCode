package Arrays_101;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 1) {
            return nums.length;
        }

        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[count] != nums[i]) {
                count++;
                nums[count] = nums[i];
            }
        }

        return count + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicates = new RemoveDuplicatesFromSortedArray();
        int[] arr = new int[]{1,1,2};
        System.out.println(Arrays.toString(arr));
        removeDuplicates.removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
}
