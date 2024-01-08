class Solution {
    public String reverseVowels(String s) {


         char[] arr = s.toCharArray();
         int l = 0;
         int r = arr.length-1;

         while(l<r){ 
             int lv = 0;
             int rv = 0;
             if(arr[l] == 'a' || arr[l] == 'e'||arr[l] == 'i'||arr[l] == 'o'||arr[l] == 'u' || arr[l] == 'A' || arr[l] == 'E'||arr[l] == 'I'||arr[l] == 'O'||arr[l] == 'U'){
                 lv =1;
             }
             if(arr[r] == 'a' || arr[r] == 'e'||arr[r] == 'i'||arr[r] == 'o'||arr[r] == 'u' || arr[r] == 'A' || arr[r] == 'E'||arr[r] == 'I'||arr[r] == 'O'||arr[r] == 'U'){
                 rv =1;
             }

             if(lv==1 && rv==1){
                 char temp = arr[l];
                 arr[l] = arr[r];
                 arr[r] = temp;
                 l++;
                 r--;
             }
             else if(lv==0 && rv==1){
                 l++;

             }
             else if(lv==1 && rv==0){
                 r--;
             }
             else{
                 l++;
                 r--;
             }
             
         }

         String string = new String(arr);  

         return string;


        
    }
}