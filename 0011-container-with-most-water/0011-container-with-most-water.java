class Solution {
    public int maxArea(int[] h) {
        int  maxwater=0;
        int n=h.length;
        int lp=0;
        int rp=n-1;
        while(lp<rp){
            int ht=Math.min(h[lp],h[rp]);
            int w=rp-lp;
            int curr=ht*w;
            maxwater=Math.max(maxwater,curr);
            if(h[lp]<h[rp]){
                lp++;}
                else{
                    rp--;
                }
                    }
                    return maxwater;
    }
}