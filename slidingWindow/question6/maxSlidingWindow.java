package slidingWindow.question6;

import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(k);
        for (int i = 0; i < k - 1; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.add(i);
        }
        for (int i = k - 1; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.add(i);
            res[i - k + 1] = nums[deque.peek()];
            if (deque.peek() == left) {
                deque.poll();
            }
            left++;
        }
        return res;
    }
}

public class MaxSlidingWindow {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(Arrays.toString(x.maxSlidingWindow(new int[] { 9, 1, 2, 3, 4 }, 3)));
    }
}
