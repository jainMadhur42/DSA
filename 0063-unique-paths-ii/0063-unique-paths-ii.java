class Solution {

    public boolean isSafe(int[][] obstacleGrid, int row, int col, int m , int n) {

        if(row < m && col < n && obstacleGrid[row][col] != 1) {
            return true;
        } else {
            return false;
        }
    }

    public int solve(int[][] obstacleGrid, int row, int col, int m, int n, int[][] dp) {

        if(row == m-1 && col == n-1) {
            return 1;
        }
        else if(row <m && col < n && dp[row][col] != -1) {
            return dp[row][col];
        } else if(isSafe(obstacleGrid, row, col, m , n)) {
            obstacleGrid[row][col] = 2;
            int right = solve(obstacleGrid, row, col + 1, m , n, dp);
            int bottom = solve(obstacleGrid, row + 1, col, m , n, dp);
            dp[row][col] =  right + bottom;
            return dp[row][col];
        } else {
            return 0;
        }
    }


    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
            for(int i =0;i <m; i++) {
                for(int j = 0; j<n; j++) {
                    dp[i][j] = -1;
                }
            }


        if(obstacleGrid[m-1][n-1] == 0) {
            return solve(obstacleGrid, 0, 0, m, n, dp);
        }
        return 0;
    }
}