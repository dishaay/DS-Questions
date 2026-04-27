1class Solution {
2    public int search(int[] nums, int target) {
3        int mid, low, high; 
4        low=0; 
5        high= nums.length-1; 
6         
7        while(low<=high){
8            mid=(low+high)/2;
9            if(nums[mid]==target){
10                return mid; 
11            }
12
13            else if(nums[mid]>target){
14                high=mid-1;
15            }
16
17            else{
18                low=mid+1;
19            }
20        }
21    return -1;
22    }
23}