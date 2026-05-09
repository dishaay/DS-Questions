class Solution {
    public int findPages(int[] arr, int m) {
        int n= arr.length;
        if(m>n){
            return -1;
        }
        int high = sum(arr);
        int low=0;
        for (int i = 0; i < n; i++) {
           low = Math.max(low, arr[i]);
        }

        while(low<=high){
            int mid=(low+high)/2;
           int res= countStudents(arr,mid);

           if(res>m){
            low=mid+1;
           }
           else{
            high=mid-1;
           }
        }
        return low;

    }


    public static int sum (int arr[]){
        int sum=0; 
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int countStudents(int arr[], int pages){
        int pagesDone=0; 
        int countStu=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+pagesDone<=pages){
                pagesDone+=arr[i];
            }
            else{
                countStu++;
                pagesDone=arr[i];
            }
        }
        return countStu;
    }
}
