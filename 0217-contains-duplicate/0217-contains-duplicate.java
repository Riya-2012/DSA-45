class Solution {

    public boolean containsDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
        // After sorting, check if any consecutive elements are the same
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        
        // If no duplicates found, return false
        return false;
    }
    
}