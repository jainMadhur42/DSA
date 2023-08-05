class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            int count = map.getOrDefault(num, 0);
            if(count == 0) {
                map.put(num, 1);
            } else if(count == 1) {
                map.remove(num);
            }
        }
        for ( Integer key : map.keySet() ) {
         return key;
        }
        return 0;
    }
}