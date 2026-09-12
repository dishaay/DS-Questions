class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int presC = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }

            else {
                if (presC < count) {
                    presC = count;
                }

                count = 0;
            }
        }

        if (count > presC) {
            return count;
        }
        return presC;
    }
}