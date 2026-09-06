class Solution {
    public void moveZeroes(int[] arr) {
        int i = -1;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0 && i == -1) {
                i = j;
            }

            else if (arr[j] != 0 && i != -1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }
}