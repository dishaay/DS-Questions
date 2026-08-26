class Solution {
    public int mySqrt(int n) {
        int low = 0;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square <= n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }
}