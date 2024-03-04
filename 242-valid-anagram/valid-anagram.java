// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()) return false;
//         int[] map = new int[26];
//         for(char c : s.toCharArray())
//         {
//             map[c-97]++;
//         }
//         for(char c : t.toCharArray())
//         {
//             if(map[c-97] > 0) map[c-97]--;
//             else return false;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())return false;

        int[] map = new int[26];

        for(char c:s.toCharArray()) map[c-'a']++;
        for(char c:t.toCharArray()){ 
              if( map[c-97]>0){
                  map[c-97]--;

              } else{ return false;}
        }

        return true;
      
    }
}