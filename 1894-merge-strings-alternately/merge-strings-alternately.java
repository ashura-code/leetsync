class Solution {
    public String mergeAlternately(String word1, String word2) {

        int i1 = 0;
        int i2 = 0;
        String ans ="";

        while(i1 < word1.length() || i2 < word2.length()){
            
            if(i1 < word1.length()){ 
                 ans = ans + word1.charAt(i1);
                 i1++;
            }
            if(i2 < word2.length()){ 
                 ans = ans + word2.charAt(i2);
                 i2++;
            }
            
        }

        return ans;
        
    }
}