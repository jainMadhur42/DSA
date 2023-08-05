class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1); 
        }
        int ans = 0;
        for ( Integer key : map.keySet() ) {
            if (map.get(key) == 1) {
                ans = key;
            } 
        }
        return ans;
    }
}