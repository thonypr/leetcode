import java.util.*;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int[] tempArray = Arrays.copyOf(nums, nums.length);
            tempArray[i] = 1;
            results[i] = getProduct(tempArray);
        }
        return results;
    }

    public int getProduct(int[] nums) {
        int answer = 1;
        for(int i : nums)
            answer *= i;
        return answer;
    }
}
