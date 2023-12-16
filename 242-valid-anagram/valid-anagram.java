class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

         int[] a = new int[s.length()];
         int[] b = new int[t.length()];

         for(int i=0;i<s.length();i++){ 
               char curr_char_s = s.charAt(i);
               char curr_char_t=t.charAt(i);

               int curr_int_s = curr_char_s;
               int curr_int_t = curr_char_t;

               a[i] = curr_int_s;
               b[i] = curr_int_t;
         }

         Arrays.sort(a);
         Arrays.sort(b);

          
         return Arrays.equals(a,b);

    }
}