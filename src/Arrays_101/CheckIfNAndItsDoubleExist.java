package Arrays_101;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {

        int fr = (int) Arrays.stream(arr)
                .filter(n -> n == 0)
                .count();

        if( fr > 1) {
            return true;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int a : arr) {
            map.put(a, a * 2);
        }

        for(int i : arr) {
            int value = map.get(i);
            int key = i;

            if(map.containsValue(i) && map.get(i) != i) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        int[] arr = new int[] {10,2,5,3};
        System.out.println(Arrays.toString(arr));

        System.out.println(checkIfNAndItsDoubleExist.checkIfExist(arr));
    }

}
