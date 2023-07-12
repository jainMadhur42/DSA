class Solution {
    public int lengthOfLastWord(String s) {
        String[] splitStrings = s.split(" ");
        return splitStrings[splitStrings.length-1].length();
        // for(int i =0; i< splitStrings.length;i++) {
        //     System.out.println(splitStrings[i]);
        // }
        // return 5;
    }
}