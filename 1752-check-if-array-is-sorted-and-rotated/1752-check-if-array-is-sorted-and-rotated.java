class Solution {
    public boolean check(int[] arr) {

        int drop=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                drop++;
            }
        }

        if(arr[arr.length-1]>arr[0]){
            drop++;
        }

        if(drop<2){
            return true;
        }

        else{
            return false;
        }
    }
}