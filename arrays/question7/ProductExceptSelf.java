package arrays.question7;

import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int productSuffix = 1;
        int productPrefix = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = productPrefix;
            suffix[nums.length - i - 1] = productSuffix;
            productPrefix *= nums[i];
            productSuffix *= nums[nums.length - i - 1];
        }     
        int[] sol = new int[nums.length];
        for (int i = 0; i < sol.length; i++) {
            sol[i] = suffix[i] * prefix[i];
        }
        return sol;
    }
}  


public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5};
        Solution x = new Solution();
        System.out.println(Arrays.toString(x.productExceptSelf(nums)));
    }
}
