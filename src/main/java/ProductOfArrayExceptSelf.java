import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suff = new int[nums.length];
        pre[0] = 1;
        suff[nums.length - 1] = 1;
        int[] results = new int[nums.length];
        for(int i = 1; i < nums.length; i++) {
            pre[i] = pre[i-1] * nums[i-1];
        }
        for(int i = nums.length - 2; i >= 0; i--) {
            suff[i] = suff[i+1] * nums[i+1];
        }
        for(int i = 0; i < nums.length; i++) {
            results[i] = pre[i] * suff[i];
        }
        return results;
    }

    public int[][] getParts(int[] nums, int exclude) {
        int arN = nums.length;
        if(exclude == 0) {
            int[][] ints = {{1}, Arrays.copyOfRange(nums, 1, arN)};
            return ints;
        }
        int[][] ints;
        if(exclude == 1) {
            ints = new int[][]{{nums[0]}, Arrays.copyOfRange(nums, 2, arN)};
        }
        else {
            ints = new int[][]{Arrays.copyOfRange(nums, 0, exclude), Arrays.copyOfRange(nums, exclude + 1, arN)};
        }
        return ints;
    }

    public int splitterratti(int ar[]) {
        if(ar.length == 0)
            return 1;
        if(ar.length == 1) {
            return  ar[0];
        }
        else {
            int arN = ar.length;
            int ar1N = arN / 2;
            int ar2N = arN - ar1N;
            int[] ar1 = new int [ar1N];
            int[] ar2 = new int [ar2N];
            int i = 0;
            for(; i < ar.length / 2; i++) {
                ar1[i] = ar[i];
            }
            for(int j = 0; i < ar.length; i++, j++) {
                ar2[j] = ar[i];
            }
            return splitterratti(ar1) * splitterratti(ar2);
        }
    }
}
