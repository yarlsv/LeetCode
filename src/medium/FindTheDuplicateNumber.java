package medium;

import java.util.Arrays;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i = 1, k = nums.length - 1; i < k; i++, k--) {
            if (nums[i - 1] == nums[i]) {
                return nums[i];
            }
            if (nums[k] == nums[k - 1]) {
                return nums[k];
            }
        }
        return 1;
    }
}
