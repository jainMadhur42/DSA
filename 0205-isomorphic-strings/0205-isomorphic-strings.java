class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
       HashMap<Character, Character> mapping = new HashMap <Character, Character> ();
	   HashMap<Character, Boolean> mappedBefore = new HashMap <Character, Boolean> ();
        
        for(int i = 0; i<s.length();i++) {
			if (mapping.containsKey(s.charAt(i)))
			{
				char mapped = mapping.get(s.charAt(i));
				if (mapped != t.charAt(i)) return false;
			}

			else {
				if (mappedBefore.containsKey(t.charAt(i))) return false;
				else { 
					mappedBefore.put(t.charAt(i), true);
					mapping.put(s.charAt(i), t.charAt(i));
				}
			}
        }
        return true;
    }
}