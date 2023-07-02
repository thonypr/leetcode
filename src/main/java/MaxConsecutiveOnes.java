import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
//        int maxConsecutiveNumber = 0;
//        int counter = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                counter++;
//            }
//            if (i == nums.length - 1 || nums[i] == 0) {
//                //1,0,1,1,0,1
//                //counter has it
//                if (counter > maxConsecutiveNumber) {
//                    maxConsecutiveNumber = counter;
//                }
//                counter = 0;
//            }
//        }
//        return maxConsecutiveNumber;
        int sum = 0, maxSum = 0;
        for(int n : nums) {
            sum += n;
            sum *= n;
            maxSum = Math.max(maxSum, sum);
            System.out.println("MAXSUM = "+ maxSum);
        }
        return maxSum;
    }
}
