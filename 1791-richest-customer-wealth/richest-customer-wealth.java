class Solution {
    public int maximumWealth(int[][] accounts) {

        int max_wealth = 0;

        for(int[] acc : accounts){ 
             int acc_wealth = 0;
            for(int money:acc) { 
                 acc_wealth = acc_wealth+money;
            }
            max_wealth = Math.max(max_wealth,acc_wealth); 
        }
        return max_wealth;
        
    }
}