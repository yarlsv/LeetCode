package easy;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;

        if (digits[index] != 9) {
            digits[index] += 1;
            return digits;
        } else {
            while(index >= 0 && digits[index] == 9) {
                digits[index] = 0;
                index--;
            }
            if(index >= 0) {
                digits[index] += 1;
            }
        }

        if(digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for(int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        }

        return digits;
    }
}
