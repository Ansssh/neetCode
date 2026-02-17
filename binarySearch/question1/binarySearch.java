package binarySearch.question1;

class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int n = left + (right - left) / 2;
            if (nums[n] == target) {
                return n;
            }
            if (nums[n] < target) {
                left = n + 1;
            }else{
                right = n;
            }
        }
        return -1;
    }
}


public class binarySearch {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.search(new int[]{-1,0,3,5,9,12}, 9));
    }
}
