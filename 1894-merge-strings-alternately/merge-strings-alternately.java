class Solution {
    public String mergeAlternately(String word1, String word2) {

         int i=0,j=0;
        String ans="";
        while(i<word1.length() && j<word2.length())
        {
            ans+=word1.charAt(i++);
            ans+=word2.charAt(j++);
        }

        while(i<word1.length())
        ans = ans+(word1.charAt(i++));

        while(j<word2.length())
        ans = ans+(word2.charAt(j++));

        return ans;

  
        
    }
}