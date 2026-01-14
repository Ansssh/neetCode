package arrays.question9;

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        Set<Integer> x = new HashSet<>();
        for(int r : nums){
            x.add(r);
        }
        for(int i = 0; i < nums.length; i++){
            int localCount = 1;
            while (x.contains(nums[i] + localCount)) {
                localCount++;
            }
            count = Math.max(count, localCount);
        }
        return count;
    }
}


public class LongestConsecutive {

    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.longestConsecutive(new int[]{1,1,3,4,5,6,7}));
    }
}