package Arrays_101;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = n + m - 1;
        int a1 = m - 1;
        int a2 = n - 1;

        while(a1 >= 0 && a2 >= 0) {
            if(nums1[a1] > nums2[a2]) {
                nums1[i--] = nums1[a1--];
            } else {
                nums1[i--] = nums2[a2--];
            }
        }

        while(a2 >= 0) {
            nums1[i--] = nums2[a2--];
        }

    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] arr1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] arr2 = new int[]{2, 5, 6};
        mergeSortedArray.merge(arr1, 3, arr2, 3);

        System.out.println(Arrays.toString(arr1));
    }
}
