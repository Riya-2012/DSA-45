class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        // Iterate through all elements in the array
        for (int num : nums) {
            // Add the current number to the heap
            minHeap.offer(num);

            // If the size of the heap exceeds 'k', remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();  // Remove the root (smallest element)
            }
        }

        // The root of the heap is the kth largest element
        return minHeap.peek(); 
    }
}