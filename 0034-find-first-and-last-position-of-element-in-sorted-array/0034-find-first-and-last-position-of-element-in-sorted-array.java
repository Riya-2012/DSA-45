class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        ans[0] = helper1(nums, target, 0, nums.length - 1);
        ans[1] = helper2(nums, target, 0, nums.length - 1);
        
        return ans;
    }
    
    // Helper function to find the first occurrence of the target
    private int helper1(int[] nums, int target, int start, int end) {
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }
    
    // Helper function to find the last occurrence of the target
    private int helper2(int[] nums, int target, int start, int end) {
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }
}
