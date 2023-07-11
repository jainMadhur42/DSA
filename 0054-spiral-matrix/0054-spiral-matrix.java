class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        int i, k = 0, l = 0;
        int m = a.length;
        int n = a[0].length;
        List<Integer> list = new ArrayList<>();

         while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                list.add(a[k][i]);
            }
            k++;
 
            // Print the last column from the remaining
            // columns
            for (i = k; i < m; ++i) {
                list.add(a[i][n-1]);
            }
            n--;
 
            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    list.add(a[m-1][i]);
                }
                m--;
            }
 
            // Print the first column from the remaining
            // columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    list.add(a[i][l]);                    
                }
                l++;
            }
        }
        return list;
    }
}