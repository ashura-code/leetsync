class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i:nums){ 
            freq.putIfAbsent(i,0);
            freq.put(i,freq.get(i)+1);
        }
        
        int sum = 0;

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1)sum+=entry.getKey();
        }
        return sum;

            
    }
}