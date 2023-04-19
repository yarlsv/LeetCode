package Arrays_101;

import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        int i = 0;
        int count = 0;

        while (i < j) {
            if (nums[i] == val) {
                if (nums[j] == val) {
                    while (nums[j] == val && i < j) {
                        j--;
                    }
                }
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            }
            i++;
        }

        for (int num : nums) {
            if (num != val) {
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] arr = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(Arrays.toString(arr));
        System.out.println(removeElement.removeElement(arr, 2));
        System.out.println(Arrays.toString(arr));
    }
}
