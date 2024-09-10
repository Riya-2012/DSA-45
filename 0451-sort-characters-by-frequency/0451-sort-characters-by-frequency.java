class Solution {
    public String frequencySort(String s) {
         Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create a max heap (priority queue) to store characters by frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = 
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        // Add all entries from the frequency map to the heap
        maxHeap.addAll(frequencyMap.entrySet());

        // Step 3: Build the output string using the characters from the max heap
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char character = entry.getKey();
            int frequency = entry.getValue();
            
            // Append the character 'frequency' number of times
            for (int i = 0; i < frequency; i++) {
                result.append(character);
            }
        }

        // Step 4: Return the result string
        return result.toString();
        
    }
}