class Solution {
    public int maxProfit(int[] arr) {
        int cp = Integer.MAX_VALUE;
        int maxP = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < cp) {
                cp = arr[i];
            } else {
                maxP = Math.max(maxP, arr[i] - cp);
            }
        }

        return maxP;
    }
}