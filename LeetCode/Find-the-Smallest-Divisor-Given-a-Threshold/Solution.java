1class Solution {
2    public int smallestDivisor(int[] arr, int threshold) {
3        int low=1;
4        int ans=-1;
5        int high= maxi(arr);
6        while(low<=high){
7            int mid=(low+high)/2;
8            int result=FindS(arr,mid);
9
10            if(result>threshold){
11                low=mid+1;
12            }
13
14            else{
15                ans=mid;
16                high=mid-1;
17            }
18        }
19        return ans;
20    }
21
22    public static int maxi(int arr[]){
23        int maxi=Integer.MIN_VALUE;
24        for(int i=0;i<arr.length;i++){
25            if(arr[i]>maxi){
26                maxi=arr[i];
27            }
28        }
29        return maxi;
30    }
31
32    public static int FindS(int arr[],int mid){
33        int sum=0;
34        for(int i=0;i<arr.length;i++){
35            
36            sum+=Math.ceil((double)arr[i]/mid);
37        }
38        return sum;
39    }
40}