class Solution {

    public void solve(ArrayList<String> ans, HashMap<Character, String> map, int i , String digits, StringBuilder sb) {
        
        // base case
        if(i == digits.length()) {
            ans.add(sb.toString());
            return;
        }    
        
        String str = map.get(digits.charAt(i));
        for(int k=0;k<str.length();k++) {
            sb.append(str.charAt(k));
            solve(ans,map,i+1,digits,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) 
            return new ArrayList<String>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");    
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        
        ArrayList<String> ans = new ArrayList<>();
        solve(ans,map,0,digits,new StringBuilder());
       

        
        return ans;
    }
}