package twoPointers.question2;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int idx1 = 0, idx2 = numbers.length - 1;
        while (idx1 < idx2) {
            if (numbers[idx1] + numbers[idx2] < target) {
                idx1++;
            }else if(numbers[idx1] + numbers[idx2] > target){
                idx2--;
            }else{
                return new int[]{idx1 + 1, idx2 + 1};
            }
        }
        return new int[]{0,0};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(Arrays.toString(x.twoSum(new int[]{1,2,3,4} , 5)));
    }
}

