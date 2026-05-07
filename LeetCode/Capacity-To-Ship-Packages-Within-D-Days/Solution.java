1class Solution {
2    public int shipWithinDays(int[] arr, int days) {
3        int low=maxi(arr);
4        int high=sumA(arr);
5        int ans=-1;
6        while(low<=high){
7            int mid=(low+high)/2;
8            int res=findDays(arr,days,mid);
9            if(res>days){
10                low=mid+1;
11            }
12            else{
13                ans=mid;
14                high=mid-1;
15            }
16        }
17
18        return ans;
19    }
20
21    public static int sumA(int arr[]){
22        int sum=0;
23        for(int i=0;i<arr.length;i++){
24            sum+=arr[i];
25        }
26
27        return sum;
28    }
29    public static int maxi(int arr[]){
30        int maxi=Integer.MIN_VALUE;
31        for(int i=0;i<arr.length;i++){
32            if(arr[i]>maxi){
33                maxi=arr[i];
34            }
35        }
36        return maxi;
37    }
38
39    public static int findDays(int arr[],int days,int mid){
40        int das=1; //day 1 pe toh hu mei abhi.
41        int loaded=0;
42        for(int i=0;i<arr.length;i++){
43        if(arr[i]+loaded>mid){
44            das++;
45            loaded=arr[i];
46        }
47
48        else{
49            loaded+=arr[i];
50        }
51    }
52    return das;
53    }
54}