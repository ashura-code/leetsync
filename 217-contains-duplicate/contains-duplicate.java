class Solution { 
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> list = new HashSet<>();


        for(int i:nums){ 
             if(!list.add(i)){
                 return true;
             }
             list.add(i);
        }

        return false;

        
    }
}