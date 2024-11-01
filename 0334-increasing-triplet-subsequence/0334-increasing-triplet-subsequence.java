class Solution {
    public boolean increasingTriplet(int[] nums) {
     int F=Integer.MAX_VALUE;
       int S=Integer.MAX_VALUE;
       int T=Integer.MAX_VALUE;
     for(int i=0;i<nums.length;i++){
        int n=nums[i];
                if(n<=F){
            F=n;
        }
        else if(n<=S){
            S=n;

        }
        else{
            T=n;
            return  true;
        }
     }
     return false;
      }
}