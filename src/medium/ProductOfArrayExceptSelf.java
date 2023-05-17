package medium;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int result = 1;
        int zeros = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                result *= nums[i];
            } else {
                zeros++;
            }
        }

        if (zeros > 1) {
            for(int i = 0; i < answer.length; i++) {
                answer[i] = 0;
            }
        } else if (zeros == 1) {
            for(int i = 0; i < answer.length; i++) {
                if(nums[i] != 0) {
                    answer[i] = 0;
                } else {
                    answer[i] = result;
                }
            }
        } else if (zeros == 0) {
            for(int i = 0; i < answer.length; i++) {
                answer[i] = result / nums[i];
            }
        }

        return answer;

    }
}
