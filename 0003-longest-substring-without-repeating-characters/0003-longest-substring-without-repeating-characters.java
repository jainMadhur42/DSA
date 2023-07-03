class Solution {
    public int lengthOfLongestSubstring(String str) {
        char[] charArray = str.toCharArray();
        int length = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();

        // Traverse the character array
        for (int i = 0; i< charArray.length; i++) {
            char c = charArray[i];
            
            if(map.containsKey(c)) {
                if(start <= map.get(c)) {
                    start = map.get(c) + 1;
                }
            } 
            length = Math.max(length, i-start + 1);
            map.put(c, i);
        }
     return length;
    }
}