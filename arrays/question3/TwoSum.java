package arrays.question3;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> x = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            x.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            if(x.get(target - nums[i]) != null){
                if(x.get(target - nums[i]) == i){
                    continue;
                }else{
                    return new int[]{i, x.get(target - nums[i])};
                }
            }
        }
        return new int[]{0,0};
    }
}


public class TwoSum {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.twoSum(new int[]{1,3,3,7,9}, 10));
    }
}
