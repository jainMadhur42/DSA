class Solution {

    public boolean solve(String s1, String s2, int i , int j , int k, String s3, int[][] dp) {
        
        if(dp[i][j] != -1) {
            return dp[i][j] == 1 ? true : false;
        }

        if(i == s1.length() && j == s2.length() && k == s3.length()) {
            return true;
        }

        boolean x = false, y = false;
        if(i<s1.length() && s1.charAt(i) == s3.charAt(k)) {
            System.out.println("s1.charAt(i) "+s1.charAt(i)+" s3.charAt(k) "+s3.charAt(k));
            x = solve(s1, s2, i+1, j, k+1, s3, dp);
        } 
        if(j<s2.length() && s2.charAt(j) == s3.charAt(k)) {
            System.out.println("s2.charAt(i) "+s2.charAt(j)+" s3.charAt(k) "+s3.charAt(k));
            y = solve(s1, s2, i, j+1, k+1, s3, dp);
        } 
            dp[i][j] = x || y ? 1 : 0;
        return x || y;
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()) {
            return false;
        }
        int[][] dp = new int[s3.length()+1][s3.length()+1];
        for(int i =0; i<s3.length()+1;i++) {
            for(int j =0; j<s3.length()+1;j++) {
                dp[i][j] = -1;
            }
        }
        return solve(s1,s2,0,0,0,s3, dp);
    }
}