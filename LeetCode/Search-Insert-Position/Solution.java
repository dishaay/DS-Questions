1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int low=0; 
4        int ans= nums.length; 
5        int high= nums.length-1; 
6
7        while(low<=high){
8            int mid=(low+high)/2;
9
10            if(nums[mid]>=target){
11                // i need to find my smallest index. 
12                high= mid-1;
13                ans=mid;
14            }
15
16            else {
17                low=mid+1;
18            }
19        }
20
21        return ans;
22    }
23}