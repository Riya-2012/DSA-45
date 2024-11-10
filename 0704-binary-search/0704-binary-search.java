class Solution {
    public int search(int[] nums, int target) {
      if(nums==null || nums.length==0){
            return -1;
      }  
      return helper(nums,target,0,nums.length-1);
       }
       private int helper(int[] nums,int target,int start, int end){
           if(start>end){
              return -1;
           }
           int mid=(start+end)/2;
           if(nums[mid]==target){
               return mid;
           }
           else if(nums[mid]>target){
               return helper(nums,target,start,mid-1);
           }
           else if(nums[mid]<target){
               return helper(nums,target,mid+1,end);
           }
           return -1;
       }
}