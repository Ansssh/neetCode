package stack.question4;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] sol = new int[temperatures.length];
        Stack<Integer> x = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            if (x.isEmpty()) {
                x.push(i);
            } else {
                while (!(x.isEmpty()) && temperatures[i] > temperatures[x.peek()]) {
                    sol[x.peek()] = i - x.peek();
                    x.pop();
                }
                x.push(i);
            }

        }
        return sol;
    }
}

public class DailyTemp {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(Arrays.toString(x.dailyTemperatures(new int[] { 30, 38, 30, 36, 35, 40, 28 })));
    }
}
