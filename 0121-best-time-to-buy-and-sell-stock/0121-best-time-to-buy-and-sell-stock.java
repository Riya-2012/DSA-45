class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;
        int s=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<s){
                s=prices[i];
            }
            maxP=Math.max(maxP,prices[i]-s);

        }
        return maxP;
    }
}