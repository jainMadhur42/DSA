class Solution {

    public int solve(int[] prices, int i, boolean buy, int[][] dp) {

        if (i == prices.length) {
            return 0;
        }

        if(dp[i][buy ? 0 : 1] != -1) {
            return dp[i][buy ? 0 : 1];
        }

        int profit = 0;
        if(buy) {
            int buykaro = - prices[i] + solve(prices, i+1, false, dp);
            int skipKaro = 0 + solve(prices, i+1, buy, dp);
            profit = Math.max(buykaro, skipKaro);
        } else {
            int buykaro = prices[i] + solve(prices, i+1, true, dp);
            int skipKaro = 0 + solve(prices, i+1, false,dp);
             profit = Math.max(buykaro, skipKaro);
        }

        return dp[i][buy ? 0 : 1] = profit;
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];

        for(int i =n-1; i>=0 ;i--) {

            for(int j =0;j<=1;j++) {
                dp[i][j] = -1;
            }
        }
        return solve(prices, 0, true, dp);
    }
}