class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> h1 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];

            if (h1.containsKey(needed)) {
                return new int[] { h1.get(needed), i };
            } else {
                h1.put(arr[i], i);
            }
        }

        return new int[] {};
    }
}