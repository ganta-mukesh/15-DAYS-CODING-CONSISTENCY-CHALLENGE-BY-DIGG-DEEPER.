class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int min_profit=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min_profit){
                 min_profit=prices[i];
            }
            else{
                max_profit=Math.max(max_profit,prices[i]-min_profit);
            }
        }
      return max_profit;
    }
}