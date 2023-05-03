package easy;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplets {

    public int arithmeticTriplets(int [] nums, int diff) {

        int count = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] - diff) && set.contains(nums[i] - diff * 2)) {
                count++;
            }
            set.add(nums[i]);
        }
        return count;
    }
}
