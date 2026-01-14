package twoPointers.question3;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> sol = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                } else if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                } else {
                    sol.add(List.of(nums[i], nums[l], nums[r]));
                    r--;
                }
            }
        }
        return new ArrayList<>(sol);
    }
}

public class ThreeSum {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
    }
}
