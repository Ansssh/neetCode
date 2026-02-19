package slidingWindow.question1;

class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int profit = 0;
        while (r < prices.length) {
            if (prices[l] <= prices[r]) {
                profit = Math.max(profit, prices[r] - prices[l]);
                r++;
            } else {
                l = r;
                r = r + 1;
            }
        }
        return profit;
    }
}

public class Stock {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.maxProfit(new int[] { 10, 8, 7, 5, 2 }));
    }
}
