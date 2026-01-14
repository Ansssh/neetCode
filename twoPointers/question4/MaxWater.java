package twoPointers.question4;

class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int maxArea = 0;
        while (l < r) {
            int area;
            if (heights[l] < heights[r]) {
                area = heights[l] * (r-l);
                l++;
            }else{
                area = heights[r] * (r-l);
                r--;
            }
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;        
    }
}


public class MaxWater {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.maxArea(new int[]{1,2,3,4,5,6,7,8}));
    }
}
