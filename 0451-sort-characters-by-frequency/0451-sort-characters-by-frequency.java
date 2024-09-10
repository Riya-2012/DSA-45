class Solution {
    public String frequencySort(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        // Step 1: Build the frequency map
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create buckets (each bucket index represents a frequency)
        // The size of the bucket array will be s.length() + 1 since the max frequency
        // any character can have is the length of the string.
        List<Character>[] buckets = new List[s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            buckets[i] = new ArrayList<>();
        }

        // Step 3: Fill the buckets
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char character = entry.getKey();
            int frequency = entry.getValue();
            buckets[frequency].add(character);
        }

        // Step 4: Build the result string from the buckets (from highest frequency to
        // lowest)
        StringBuilder result = new StringBuilder();
        for (int i = s.length(); i >= 0; i--) {
            for (char c : buckets[i]) {
                for (int j = 0; j < i; j++) { // Add character 'i' times (its frequency)
                    result.append(c);
                }
            }
        }
    }
}