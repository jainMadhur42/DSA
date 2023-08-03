class Solution {

    private ArrayList<Integer> arrayList(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: nums) list.add(num);
        return list;
    }
    public void permute(int[] nums, Set<List<Integer>> ans, int start) {
        if(start == nums.length) {
            ans.add(arrayList(nums));
        }
            
        for(int i = start;i<nums.length;i++) {
            swap(nums,i,start);
            permute(nums,ans,start+1);
            swap(nums,i,start);
        }
    }

    public void swap(int[] nums, int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }   

    public List<List<Integer>> permute(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        permute(nums,ans,0);
        return new ArrayList(ans);
    }
}