class Solution {
    public int trap(int[] h) {
        int n =h.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=h[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(h[i],left[i-1]);
             }
             right[n-1]=h[n-1];
             for(int i=n-2;i>=0;i--){
right[i]=Math.max(h[i],right[i+1]);

             }  
             int a=0;
             for(int i =0;i<n;i++){
                a+=(Math.min(left[i],right[i])-h[i]);
             } 
             return a;
              }
}