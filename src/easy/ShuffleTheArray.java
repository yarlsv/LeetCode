package easy;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int part1 = 0;
        int part2 = n;

        for(int i = 1; i < nums.length; i += 2) {
            result[i - 1] = nums[part1++];
            result[i] = nums[part2++];
        }

        return result;
    }
}
