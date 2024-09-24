class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // Calculate mid to avoid overflow
            
            // If target is found, return its index
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which part of the array is sorted
            if (nums[left] <= nums[mid]) {
                // Left part is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    // Target lies in the left sorted part
                    right = mid - 1;
                } else {
                    // Target is in the right part
                    left = mid + 1;
                }
            } else {
                // Right part is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    // Target lies in the right sorted part
                    left = mid + 1;
                } else {
                    // Target is in the left part
                    right = mid - 1;
                }
            }
        }

        // If target is not found, return -1
        return -1;
    }
    
}