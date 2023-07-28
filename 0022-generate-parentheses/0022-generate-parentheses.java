class Solution {
    public void solve(List<String> ans, String str, int n, int open, int close) {
        if(str.length() == 2*n) {
            ans.add(str);
            return;
        }
        if(open<n)
            solve(ans,str+"(",n, open+1, close);
        if(close<open) 
            solve(ans,str+")",n, open, close+1);   
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        solve(list, "(", n,1,0);    
        return list;
    }
}