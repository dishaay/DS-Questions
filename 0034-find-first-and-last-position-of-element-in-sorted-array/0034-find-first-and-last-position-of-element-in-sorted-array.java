class Solution {
    public int[] searchRange(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int first = -1;

        // Find first occurrence
        while(low <= high){

            int mid = (low + high) / 2;

            if(arr[mid] >= target){
                first = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        // Make sure target actually exists
        if(first == -1 || arr[first] != target){
            return new int[]{-1, -1};
        }

        low = 0;
        high = arr.length - 1;

        // Find first position greater than target
        while(low <= high){

            int mid = (low + high) / 2;

            if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        int last = low - 1;

        return new int[]{first, last};
    }
}