class Solution {
    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums); 
        int low=0; 
        int high= nums[nums.length-1]-nums[0];

        while(low<=high){
            int mid=(low+high)/2; 
            
           boolean res= placeCows(nums,k,mid);
            if(res){
                low=mid+1; //I want to look for higher possiblity. 
            }

            else{
                //agar yeh hi nahi ho raha toh, toh aage ke kya hi hoge. 
                high= mid-1; 
            }
        }
        return high; 
    }

    public static boolean placeCows(int arr[],int k, int mid){
        //so i have a minimum distance, like i will get it from mid. i am assuming that everytime i place a cow, i am placing it on the first position. 
        int cowStanding=1;
        int last= arr[0]; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]-last>=mid){
                cowStanding++;
                last= arr[i];
            }


            if(cowStanding>=k){
                return true;
            }
        }
        return false;
    }
}
