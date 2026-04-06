package linkedList.question8;

class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[Math.abs(nums[i]) - 1] < 0){
                return Math.abs(nums[i]);
            }
            nums[Math.abs(nums[i]) - 1] *= -1;
        }
        return -1;
    }
}

public class FindDuplicate {

    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.findDuplicate(new int[]{1,2,3,4,5,3}));
    }
}