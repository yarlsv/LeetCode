package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum (int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];

        for(int i = 0; i < nums.length; i++) {
            if(map.get(target - nums[i]) != null) {
                arr[0] = map.get(target - nums[i]);
                arr[1] = i;
                return arr;
            }
            map.put(nums[i], i);
        }

        return arr;
    }
}
