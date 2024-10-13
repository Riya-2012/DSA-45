
class Solution {
    public boolean isPowerOfTwo(int n) {
        // A power of two must be greater than 0, and n & (n - 1) should be 0
        return n > 0 && (n & (n - 1)) == 0;
    }
}
