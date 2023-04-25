package easy;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int index = -1;
        int mid;
        int high = nums.length - 1;
        int low = 0;

        while (low <= high) {
            mid = low + ((high - low) / 2);
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] == target) {
                index = mid;
                break;
            }
        }

        return index;
    }
}
