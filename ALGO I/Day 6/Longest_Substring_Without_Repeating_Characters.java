import java.util.*;
class Solution 
{
    public int lengthOfLongestSubstring(String s)
    {
        int max=0;
        HashMap<Character,Integer>hash=new HashMap<Character,Integer>();
        int i=0;
        int j=0;
        while(j<s.length())
        {
            if(hash.containsKey(s.charAt(j)))
            {
                i=Math.max(hash.get(s.charAt(j)),i);
            }
             hash.put(s.charAt(j),j+1);
             max=Math.max(j-i+1,max); 
             j=j+1;
        }
        return max;
    }
}
class Main{
  public static void main(String[] args){
    int answer = (new Solution()).lengthOfLongestSubstring("abcdefg");
    System.out.print(answer);
  }
}