package stack.question5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer, Integer> pospeed = new HashMap<>();
        Stack<Double> x = new Stack<>();
        for (int i = 0; i < position.length; i++) {
            pospeed.put(position[i], speed[i]);
        }
        Arrays.sort(position);
        int count = 0;
        double currTop = 0.0;
        for (int i = position.length - 1; i >= 0; i--) {
            double time = (target - position[i]) * 1.0 / pospeed.get(position[i]);
            System.out.println(time);
            if (x.isEmpty()) {
                currTop = time;
                count++;
            }else{
                if (currTop < time) {
                    currTop = time;
                    count++;
                }
            }
            x.push(time);
        }
        return count;
    }
}

public class carFleet {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.carFleet(10, new int[]{0,4,2}, new int[]{2,1,3}));
    }
}
