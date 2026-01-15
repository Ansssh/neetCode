package twoPointers.question5;

class Solution {
    public int trap(int[] height) {
        int[] suffix = new int[height.length];
        int[] prefix = new int[height.length];
        int lMax = -1, rMax = -1;
        for (int i = 0; i < height.length; i++) {
            lMax = Math.max(lMax, height[i]);
            rMax = Math.max(rMax, height[height.length - 1 - i]);

            prefix[i] = Math.max(lMax, height[i]);
            suffix[height.length - 1 - i] = Math.max(rMax, height[height.length - 1 - i]);
        }
        int water = 0;
        for (int i = 0; i < height.length; i++) {
            water += Math.min(prefix[i], suffix[i]) - height[i] < 0 ? 0 : Math.min(prefix[i], suffix[i]) - height[i];
        }
        return water;
    }
}

    
public class Trap {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.trap(new int[]{0,2,0,3,1,0,1,3,2,1}));
    }
}