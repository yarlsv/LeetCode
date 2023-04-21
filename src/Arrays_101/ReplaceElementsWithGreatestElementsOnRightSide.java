package Arrays_101;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementsOnRightSide {

    public int[] replaceElements(int[] arr) {

        if(arr.length < 2) {
            return new int[] {-1};
        }

        int x = 0;
        arr[0] = -1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[x] < arr[i]) {
                arr[x] = arr[i];

                if ( x > 0) {
                    x--;
                    while (x >= 0 && arr[x] < arr[i]) {
                        arr[x] = arr[i];
                        x--;
                    }
                }
                arr[i] = -1;
            }
            x = i;

        }
        return arr;
    }

    public static void main(String[] args) {
        ReplaceElementsWithGreatestElementsOnRightSide replace =
                new ReplaceElementsWithGreatestElementsOnRightSide();

        int [] arr = new int[] {3,1,5,4,2};

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(replace.replaceElements(arr)));
    }
}
