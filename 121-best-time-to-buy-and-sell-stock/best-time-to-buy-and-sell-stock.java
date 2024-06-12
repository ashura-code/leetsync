class Solution {
    public int maxProfit(int[] prices) {
         
        int max_profit = 0;
        int left = 0;
        

        for(int right = 1; right < prices.length ; right++) {
              
              if(prices[left] >= prices[right])left = right;

              else{ 
                 max_profit = Math.max(max_profit,prices[right]-prices[left]);
              }
        }  

        return max_profit;
    }
}
