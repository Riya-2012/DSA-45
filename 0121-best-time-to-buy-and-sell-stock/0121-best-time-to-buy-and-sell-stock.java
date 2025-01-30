class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;
        int s=prices[0];
        for(int i=0;i<prices.length;i++){
            s=Math.min(s,prices[i]);
            int profit=prices[i]-s;
            maxP=Math.max(maxP,profit);

        }
        return maxP;
    }
}