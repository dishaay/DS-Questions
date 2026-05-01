1class Solution {
2    public int singleNonDuplicate(int[] arr) {
3        //dealing with edge cases. 
4
5        int n= arr.length; 
6        if(n==1){//ekk hi element hai {
7            return arr[0];
8        }
9
10        if(arr[0]!=arr[1]){
11            return arr[0];
12        }
13
14        if(arr[n-1]!=arr[n-2]){
15            return arr[n-1];
16        }
17
18        int low= 1; 
19        int high=arr.length-2;
20        while(low<=high){
21            int mid=(low+high)/2;
22
23            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
24                return arr[mid];
25            }
26            if((mid%2==0 && arr[mid] == arr[mid+1]) || (mid%2==1 && arr[mid]==arr[mid-1])){
27                low=mid+1;
28            }
29
30            else{
31                high=mid-1;
32            }
33        } 
34
35        return -1; 
36    }
37}
38