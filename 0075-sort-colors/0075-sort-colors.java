class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(mid<=end){
switch(nums[mid]){

    case 0:
    swaps(nums,start,mid);
    start++;
    mid++;

    break;
    case 1:
mid++;
break;
case 2:
swaps(nums,mid,end);
end--;
break;
}
        }
    }

    private void swaps(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}