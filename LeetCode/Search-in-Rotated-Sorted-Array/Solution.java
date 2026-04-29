1class Solution {
2    public int search(int[] arr, int target) {
3        int low= 0; 
4        int high= arr.length-1;
5
6        while(low<=high){
7            int mid= (low+high)/2; 
8
9            if (arr[mid]==target){
10                return mid; 
11            }
12            //check for one half if the array is sorted. 
13
14            if(arr[low]<=arr[mid]){
15                //left sorted. 
16
17                if(target>=arr[low] && target<=arr[mid]){
18                    high= mid-1; // i reduced my search space here. 
19                }
20
21                else{ 
22                    //that means you exist on the right side of the sorted part , so go there now. 
23                    low=mid+1;
24                }
25            }
26
27            else { 
28                //right is sorted. 
29
30                if(target>= arr[mid] && target<=arr[high]){
31                    low= mid+1; 
32                }
33
34                else {
35                    high= mid-1;
36                }
37            }
38        }
39
40        return -1; 
41    }
42}