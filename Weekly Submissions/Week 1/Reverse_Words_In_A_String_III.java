
class Solution {
    public String reverseWords(String s) {
        
        int len = s.length(); 
        if(len == 1) 
            return s;
        
        int firstIndex, lastIndex;
        char[] res = s.toCharArray(); 
        char temp;
        
        for(int index = 0 ; index < len ; index++){
            
            firstIndex = index; 
            
            while(++index < len && res[index] != ' '); 
            lastIndex = index - 1; 
            
      // reversing characters of the word
            while(firstIndex < lastIndex){
                temp = res[firstIndex];
                res[firstIndex++] = res[lastIndex];
                res[lastIndex--] = temp;
            }
        }
        
        return new String(res); 
    }
}