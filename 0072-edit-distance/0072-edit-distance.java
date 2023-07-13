class Solution {

    public int solve(String word1, String word2, int i , int j, int[][] dp) {

        if(i == word1.length()) {

            return word2.length() - j;
        } if(j == word2.length()) {

            return word1.length() - i;
        }
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        
        int ans = 0;
        if(word1.charAt(i) == word2.charAt(j)) {
           return solve(word1, word2, i+1, j+1, dp);
        } else {
            // insert
            int insert = 1+ solve(word1, word2, i, j+1, dp);
            // Delete
            int delete = 1 + solve(word1, word2, i+1, j, dp);
            // replace
            int replace = 1 + solve(word1, word2, i+1, j+1, dp);

            ans = Math.min(insert, Math.min(delete, replace));
            dp[i][j] = ans;
        }

        return ans;
    }

    public int minDistance(String word1, String word2) {
        
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m][n];

        for(int i =0; i <m;i++) {
            for(int j =0; j<n;j++) {
                dp[i][j] = -1;
            }
        }
        return solve(word1, word2, 0, 0, dp);
    }
}