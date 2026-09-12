class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length; 
        int eSum = (n*(n+1))/2;
        int aSum= 0 ; 
        for(int i=0;i<arr.length;i++){
            aSum += arr[i];
        }    

        return eSum-aSum;
    }
    
    
}