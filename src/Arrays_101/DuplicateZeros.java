package Arrays_101;

import java.util.Arrays;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                if(++i < arr.length) {
                    addZero(arr, i);
                    i++;
                }

            }
        }
    }

    private void addZero(int[] arr, int i) {
        int temp1 = arr[i];
        int temp2;

        for (int k = i + 1; k < arr.length; k++) {
            temp2 = arr[k];
            arr[k] = temp1;
            temp1 = temp2;
        }

        arr[i] = 0;
    }

    public static void main(String[] args) {
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        int[] arr = new int[] {1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println(Arrays.toString(arr));

        duplicateZeros.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
