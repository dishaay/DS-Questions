class Solution {
    public void moveZeroes(int[] arr) {
        int i = 0;
        int j=0;
        if (arr[i] == 0) {
            j = i;
        } else {
            i++;
        }

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] != 0) {
                swap(arr, k, j);
                j++;
            }
        }
    }

    public static void swap(int[] arr, int k, int j) {
        int temp = arr[k];
        arr[k] = arr[j];
        arr[j] = temp;
    }

}