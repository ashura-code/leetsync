class Solution {
    public String reverseWords(String s) {

        String[] arr = s.split(" "); 

        int l = 0;
        int r = arr.length-1;

        while(l<r){ 
             String temp = arr[l];
             arr[l] = arr[r];
             arr[r] = temp;
             l++;
             r--;
        }

        StringBuilder ans = new StringBuilder();

        for(String string:arr){ 
            if (!string.isEmpty()) {
                ans.append(string).append(" ");
            }
             
        }

        return ans.toString().trim();

        
    }
}