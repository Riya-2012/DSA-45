class Solution {

    public boolean containsDuplicate(int[] nums) {
        // Initialize a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        
        // Iterate over the array
        for (int num : nums) {
            // If the element already exists in the set, return true
            if (!set.add(num)) {
                return true;
            }
        }
        
        // If no duplicates found, return false
        return false;
    }

   
    
}