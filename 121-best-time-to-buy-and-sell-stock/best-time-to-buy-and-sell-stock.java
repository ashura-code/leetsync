class Solution {
    public int maxProfit(int[] prices) {

       if(prices.length < 2){
           return 0;
       }

       int left = 0;
       int right = 1;
       int max_profit = 0;
       int profit = 0;

       while(right < prices.length) {
            profit = prices[right] - prices[left];

            if(profit < 0){ 
                 left = right;
            }
            else{
                if(profit > max_profit){ 
                     max_profit = profit;
                }
            }
            right++;

       }

       return max_profit;
        
    }
}