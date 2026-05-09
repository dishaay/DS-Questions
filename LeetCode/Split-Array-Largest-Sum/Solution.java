1class Solution {
2
3    public int splitArray(int[] nums, int k) {
4
5        int low = 0;
6        int high = 0;
7
8        for (int i = 0; i < nums.length; i++) {
9            low = Math.max(low, nums[i]);
10            high += nums[i];
11        }
12
13        while (low <= high) {
14
15            int mid = low + (high - low) / 2;
16
17            int partitions = countPartitions(nums, mid);
18
19            if (partitions > k) {
20                low = mid + 1;
21            } else {
22                high = mid - 1;
23            }
24        }
25
26        return low;
27    }
28
29    public int countPartitions(int[] nums, int maxSum) {
30
31        int partitions = 1;
32        int sum = 0;
33
34        for (int i = 0; i < nums.length; i++) {
35
36            if (sum + nums[i] <= maxSum) {
37                sum += nums[i];
38            } else {
39                partitions++;
40                sum = nums[i];
41            }
42        }
43
44        return partitions;
45    }
46}