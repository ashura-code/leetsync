class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
       List<Character> list = new ArrayList<>();
       for(char c:s.toCharArray()){ 
            if(Character.getNumericValue(c)>= 0 && Character.getNumericValue(c)<36) {
                  list.add(c);
            }
       }

       int l=0;
       int r = list.size()-1;

       while(l<r){ 
          if(list.get(l) == list.get(r)){ 
              l++;r--;
          }else{ 
             return false;
          } 
       }

       return true;

    }
}
