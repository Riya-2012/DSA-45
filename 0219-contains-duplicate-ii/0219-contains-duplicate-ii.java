import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Check if nums[i] exists and if the indices are within the range k
            if (map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)) {
                return true;
            }

            // Update the map with the latest index of nums[i]
            map.put(nums[i], i);

            // Maintain a window of size k by removing older elements
            if (i >= k) {
                map.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}
