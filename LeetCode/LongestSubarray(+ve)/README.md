Longest Subarray with Sum K (Sliding Window)
Problem Statement

Given an array of positive integers arr[] and an integer k, find the length of the longest contiguous subarray whose sum is equal to k.

Example

Input

arr = [1, 2, 3, 1, 1, 1, 1]
k = 6

Output

4

Explanation

The longest subarray with sum 6 is:

[3, 1, 1, 1]

Length = 4

Approach: Sliding Window

Since all array elements are positive, we can use the Sliding Window technique.

Idea
Expand the window by moving the right pointer.
Keep adding elements to the current sum.
If the sum becomes greater than k, shrink the window from the left.
Whenever the sum equals k, update the maximum length.
Algorithm
Initialize:
left = 0
sum = 0
maxLen = 0
Traverse the array using the right pointer.
Add arr[right] to sum.
While sum > k:
Subtract arr[left] from sum
Increment left
If sum == k:
Update maxLen
Return maxLen.
