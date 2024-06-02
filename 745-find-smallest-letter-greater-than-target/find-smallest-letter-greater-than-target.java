class Solution {
    public char nextGreatestLetter(char[] letters, char target) {


    

       int l = 0;
       int r = letters.length-1;
       char res = letters[0];


       while(l<=r){ 
         int mid = l + (r-l)/2;

         if(letters[mid] > target ){
             r = mid-1;
             res = letters[mid];
         }
         else if(letters[mid] <= target ){
             l = mid+1;
         }
         

       }

       return res; 
    }
}