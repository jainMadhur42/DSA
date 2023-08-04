class Solution {

    public int solve(int i, String s, List<String> wordDict, int[] dp) {

        if(i == s.length()) return 1;

        if(dp[i] != -1) {
            return dp[i];
        }    

        String temp = "";
        for(int j = i; j<s.length(); j++) {
            temp += s.charAt(j);
            if(wordDict.contains(temp)) {
                if(solve(j+1, s, wordDict, dp) == 1) {
                    dp[i] = 1;
                    return dp[i];
                }
            }
        }
        dp[i] = 0;
        return dp[i];
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[500];
        Arrays.fill(dp, -1);
        return solve(0, s, wordDict, dp) == 1 ? true : false;
    }
}