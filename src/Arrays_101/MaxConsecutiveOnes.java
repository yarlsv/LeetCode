package Arrays_101;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int seq = 0;

        for(int i : nums) {
            if(i == 1) {
                seq++;
            } else {
                if(seq > max) {
                    max = seq;
                }
                seq = 0;
            }
        }

        if(seq > max) {
            max = seq;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}));
    }
}
