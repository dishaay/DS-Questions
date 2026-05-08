# Aggressive Cows

## Problem
Place `k` cows in stalls such that the minimum distance between any two cows is maximum.

## Approach
- Sort the array first
- Apply Binary Search on the answer
- Use a helper function to check if placing cows is possible

## Intuition
If a minimum distance is possible, then smaller distances are also possible.

So:
- possible → search right
- not possible → search left

## Time Complexity
O(n log n)

## Space Complexity
O(1)
