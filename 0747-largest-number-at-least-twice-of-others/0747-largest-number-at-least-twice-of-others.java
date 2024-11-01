// class Solution {
//     public int dominantIndex(int[] nums) {
//         int max=0;
//         for(int i=0;i<nums.length;i++){

//             if(nums[i]>nums[max]){
//                 max=i;

//             }
//         }
//         for(int i=0;i<nums.length;i++){
//             if(i==max){
//                 continue;
//             }
//            if( nums[i]*2<=nums[max]){
//             return max ;
//            }
//            else{
//             return -1;
//            }
          
//         }
//         return -1;
//     }
// }
class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0; // If there's only one element, it is the dominant index by default

        int maxIndex = 0;
        int secondMax = Integer.MIN_VALUE;

        // Find the maximum element and its index
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                secondMax = nums[maxIndex]; // Previous max becomes second max
                maxIndex = i;               // Update max index
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        // Check if the largest element is at least twice as large as the second largest
        if (nums[maxIndex] >= 2 * secondMax) {
            return maxIndex;
        }
        return -1;
    }
}
