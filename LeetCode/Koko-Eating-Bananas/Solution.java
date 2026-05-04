1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        // so i have to find the minimum time which koko takes to eat all the banana within h hours . step 1: find the maximum element in my array. 
4
5        int max=0; 
6        for(int i=0; i<piles.length;i++){
7            if(piles[i]>max){
8                max=piles[i]; 
9            }
10        }
11
12        //step 2: implement binary search here. 
13        //step 3: find the total hours 
14        int low=1; 
15        int high=max;
16        int ans= Integer.MAX_VALUE;
17        while(low<=high){
18            int mid=(low+high)/2; 
19
20            int totalH=findTotal(piles,mid);
21
22            if(totalH <= h){
23                high=mid-1;
24            }
25
26            else{
27                low=mid+1;
28            }
29        }
30        return low;
31    }
32
33            public static int findTotal(int [] piles , int mid){
34            int totalH=0; 
35
36            for(int i= 0; i<piles.length;i++){
37                totalH+=Math.ceil((double)piles[i]/(double)mid);
38            }
39
40            return totalH;
41        }
42}