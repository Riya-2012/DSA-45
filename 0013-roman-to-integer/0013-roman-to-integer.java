class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        // Initialize the result variable
        int result = 0;
        
        // Iterate through the Roman numeral string
        for (int i = 0; i < s.length(); i++) {
            // Get the value of the current Roman numeral character
            int currentValue = romanMap.get(s.charAt(i));
            
            // Check if the current value is less than the next value
            // If yes, subtract the current value from the result
            if (i + 1 < s.length() && currentValue < romanMap.get(s.charAt(i + 1))) {
                result -= currentValue;
            } 
            // Otherwise, add the current value to the result
            else {
                result += currentValue;
            }
        }
        
        // Return the result, which is the converted integer
        return result;
    }
    }
