class Solution {
    public boolean isPalindrome(String str) {
        int l = 0;
        int h = str.length()-1;

        str = str.toLowerCase();
        while(l<=h) {
            char getAtl = str.charAt(l);
            char getAth = str.charAt(h);
                
            if (!Character.isLetterOrDigit(getAtl))
                l++;
             
          
            else if(!Character.isLetterOrDigit(getAth))
                h--;

            else if( getAtl == getAth)
            {
                l++;
                h--;
            } else {
                return false;
            }
        }
        
        return true;
    }
}