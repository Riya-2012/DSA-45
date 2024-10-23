class Solution {
    public int maxProduct(int[] nums) {
        int FL=Integer.MIN_VALUE;
        int SL=Integer.MIN_VALUE;
        int n =nums.length;
        for(int  i=0;i<n;i++){
if(nums[i]>FL){

    SL=FL;
    FL=nums[i];
}
else if(nums[i]>SL ){
    SL=nums[i];
}
        }
        int ans=(SL-1)*(FL-1);
        return ans;
        
    }
}