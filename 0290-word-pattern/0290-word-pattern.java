class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();

        String[] strings =  s.split(" ");
         char[] charArray = pattern.toCharArray();
        System.out.println("strings "+strings.length+" charArray"+charArray.length);

       int i =0;
        for(; i<charArray.length && i < strings.length;i++) {

            Character ch = charArray[i];
            String resultString = map.getOrDefault(ch, "");
            Character resultChar = reverseMap.getOrDefault(strings[i], ' ');
            System.out.println("resultString "+resultString+" strings[i] "+strings[i]+" for char "+ch);

            
            if(resultString.isEmpty() && resultChar == ' ') {
                
                map.put(ch,strings[i]);
                reverseMap.put(strings[i], ch);
            } else if(!resultString.equals(strings[i])) {
                return false;
            }
            System.out.println("Map for char "+ch+" "+map.get(ch));
        }
        
        if(i<strings.length || i < charArray.length) {
            return false;
        }
        return true;
    }
}