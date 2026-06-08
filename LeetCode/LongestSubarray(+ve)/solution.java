class Solution {
    public int longestSubarray(int[] arr, int k) {
       int left=0; 
       int right=0; 
       int maxLen=0; 
       int sum=arr[0];

       while(right<arr.length){
        //what do i have to do? my sum is exceeded, let me reduce it by moving my left. 

        while(left<=right && sum>k){
            sum-=arr[left];
            left++;
        }

        //sum is totally equal to my targetted sum. 
        if(sum==k){
            maxLen=Math.max(maxLen, right-left+1);
        }

        //roz ka kaam kya hai? 
        right++; //right ko aage badhao 
        if(right<arr.length){
            sum+=arr[right]; //aur fir mere right ke sum ko add karo.
        }
       }
       return maxLen;
    }
}
