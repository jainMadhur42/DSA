class Solution {
    public String reverseWords(String s) {
        String[] splitString = s.split("\\s+");
        StringBuilder ans = new StringBuilder();

        for(int i = splitString.length-1; i >=0 ; i--) {
            ans.append(splitString[i].trim());
            if( i != 0 ) {
                ans.append(" ");
            }
        }

        return ans.toString().trim();
    }
}