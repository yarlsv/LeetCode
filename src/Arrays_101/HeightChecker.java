package Arrays_101;

import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {

        int count = 0;

        Object[] sortedArray = Arrays.stream(heights)
                .sorted()
                .boxed()
                .toArray();

        for(int i = 0; i < sortedArray.length; i++) {
            if((int) sortedArray[i] != heights[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HeightChecker heightChecker = new HeightChecker();
        int[] arr = new int[] {5, 1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));

        heightChecker.heightChecker(arr);
        System.out.println(Arrays.toString(arr));
    }
}
