package binarySearch.question4;

class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (nums[l] > nums[r]) {
                int mid = l + (r - l) / 2;
                if (nums[mid] > nums[l]) {
                    l = mid;
                }else if(nums[mid] <= nums[r]){
                    r = mid;
                }
                if (r - l == 1) {
                    return nums[r];
                }
            }else{
                return nums[l];
            }
        }
        return -1;
    }
}

public class MinRotateFind {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.findMin(new int[]{4,5,0,1,2,3}));        
    }
}
