/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public void solve(TreeNode root, List<Integer> list) {
        if(root == null) return;
        
        solve(root.left,list);
        list.add(root.val);
        solve(root.right,list);
    }

    public int getMinimumDifference(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        solve(root, list);
        int minDiff = Integer.MAX_VALUE;
        for(int i : list) System.out.print(i+" ");
        for(int i =0;i<list.size()-1;i++){
            minDiff = Math.min(minDiff, list.get(i+1) - list.get(i));
        }
        return minDiff;
    }
}