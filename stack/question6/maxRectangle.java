package stack.question6;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int minHeight = heights[i];
            for (int j = i; j < heights.length; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }
}


public class maxRectangle {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.largestRectangleArea(new int[]{7,1,7,2,2,4}));
    }
}
