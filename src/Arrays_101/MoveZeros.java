package Arrays_101;

import java.util.Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {

        int end = nums.length - 1;

        for(int i = 0; i < end; i++) {
            if(nums[i] == 0) {
                swapToEnd(nums, i, end);
                end--;
                if(nums[i] == 0) {
                    i--;
                }
            }
        }
    }

    private void swapToEnd(int[] arr, int index, int length) {

        for(int i = index; i < length; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] arr = new int[] {0, 0, 1};

        System.out.println(Arrays.toString(arr));

        moveZeros.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
