class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int k = i + 1; k < prices.length; k++) {
                res = Math.max(res, prices[k] - prices[i]);
            }
        }
        return res;
    }
}
