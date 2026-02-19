package binarySearch.question3;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int res = Integer.MAX_VALUE;
        int l = 1, r = piles[0];
        for(int i = 0; i < piles.length; i++){
            if(r < piles[i]){
                r = piles[i];
            }
        }
        while(l <= r){
            int speed = l + (r - l) / 2;
            long totalTime = 0;
            for(int i = 0; i < piles.length; i++){
                totalTime += Math.ceil(piles[i] * 1.0 / speed);
            }
            if(totalTime <= h){
                res = Math.min(res, speed);
            }
            if(totalTime > h){
                l = speed + 1;
            }else if(totalTime <= h){
                r = speed - 1;
            }
        }
        return res;
    }
}


public class koko {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.minEatingSpeed(new int[]{1,1,1,999999999}, 10));
    }
}
