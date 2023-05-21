package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatedInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]) {
                result.add(nums[i]);
            }
        }

        return result;
    }
}
