package Arrays_101;

public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {

        if (arr.length < 3) {
            return false;
        }

        int peak = arr[0];
        int index = 0;

        for(int i = 1; i < arr.length; i++) {
            if(peak < arr[i]) {
                peak = arr[i];
                index++;
            } else {
                break;
            }
        }

        if(index == arr.length - 1 || peak == arr[0] ) {
            return false;
        }

        for(int i = index + 1; i < arr.length; i++) {
            if(peak > arr[i]) {
                peak = arr[i];
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidMountainArray validMountainArray = new ValidMountainArray();
        int[] arr = new int[] {9,8,7,6,5,4,3,2,1};
        System.out.println(validMountainArray.validMountainArray(arr));
    }
}
