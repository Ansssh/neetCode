package arrays;

import java.util.*;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> x = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            x.add(nums[i]);
        }
        return !(x.size() == nums.length);
    }
}

public class Q1_containsDuplicates {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.hasDuplicate(new int[]{1,2,2,5}));
    }    
}
