package stack.question6;

import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> x = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!x.isEmpty() && heights[i] <= heights[x.peek()]) {
                maxArea = Math.max(maxArea, heights[x.pop()] * (i - (x.isEmpty() ? -1 : x.peek()) - 1));
            }
            x.push(i);
        }
        while (!x.isEmpty()) {
            maxArea = Math.max(maxArea, heights[x.pop()] * (heights.length - (x.isEmpty() ? -1 : x.peek()) - 1));
        }
        return maxArea;
    }
}

public class MaxRectangle {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.largestRectangleArea(new int[] { 2, 1, 5, 6, 2, 3 }));
    }
}
