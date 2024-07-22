class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            profit=prices[i]-buy;
             maxprofit=Math.max(profit,maxprofit);
                
    }
    return maxprofit;
}
}