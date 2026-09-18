class Solution {
    public void sortColors(int[] arr) {
        int mid = 0;
        int low = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swapA(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 2) {
                swapA(arr, high, mid);
                high--;
            } else {
                mid++;
            }
        }
    }

    public static void swapA(int[] arr, int mid, int high) {
        int temp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = temp;
    }
}
