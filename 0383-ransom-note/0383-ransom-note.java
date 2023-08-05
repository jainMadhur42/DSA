class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        char[] charArray = magazine.toCharArray();
        HashMap<Character, Integer> map
            = new HashMap<Character, Integer>();
        
        for(int i =0; i<charArray.length;i++) {
            int count = map.getOrDefault(charArray[i], 0);
            map.put(charArray[i], count+1);
        }

        charArray = ransomNote.toCharArray();
        for(int i =0; i<charArray.length;i++) {
            if (!map.containsKey(charArray[i])) {
                return false;
            }else {
                int count = map.getOrDefault(charArray[i],0);
                if(count == 1) {
                    map.remove(charArray[i]);
                } else {
                    map.put(charArray[i],count-1);
                } 
            }
        }
        return true;
    }
}