class Solution {

    public void solve(ArrayList<Integer> output
                                        , List<List<Integer>> ans
                                        , int n, int k, int index) {
        if (output.size() == k) {
            ans.add(new ArrayList<Integer>(output));
            return;
        }                                    


        for(int i = index; i<=n;i++) {
            output.add(i);
            solve(output, ans, n, k, i+1);
            output.remove(output.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        solve(new ArrayList<Integer>(), ans ,n, k, 1);
        return ans;
    }
}