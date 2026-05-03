1class Solution {
2    public int findPeakElement(int[] arr) {
3        //so i have to find my peak element here. condition 1: I say that i have a single element in my array. 
4
5        int n= arr.length; 
6        if(n==1){
7            return 0; //that element itself is my peak element. 
8        }
9
10        //to avoid additional edge cases for my first and the last element in my array, i will just solve them manually. 
11
12        if(arr[0]>arr[1]){
13            return 0;
14        }
15
16        else if(arr[n-1]>arr[n-2]){
17            //I am talking about my last element. 
18            return n-1;
19        }
20
21        int low=1; 
22        int high= n-2; 
23
24        while(low<=high){
25            int mid= (low+high)/2; 
26
27
28            if(arr[mid]>arr[mid-1] && arr[mid+1]<arr[mid]){
29                return mid;         //peak element hi mid pe mil gaya
30            }
31
32            else if (arr[mid]>arr[mid-1]){
33                low=mid+1;             //increasing order. 
34            }
35
36            else {
37                high=mid-1;             //with this condn it either goes left or right
38            }
39        }
40        
41        return -1;
42    }
43}