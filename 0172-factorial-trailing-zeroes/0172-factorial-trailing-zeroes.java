class Solution {
    public int trailingZeroes(int n) {
        if(n == 0) return 0;
        int count = 0;
        while(n >4) {
             
             count = count+ n/5;  
             n = n/5; 
        }
        return count;
    }
}