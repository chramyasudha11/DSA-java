Maximum Subarray Problem (Kadane’s Algorithm)
Problem Statement

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Example
Input:
nums = [-2,1,-3,4,-1,2,1,-5,4]
Output:
6
Explanation:

The subarray [4, -1, 2, 1] has the largest sum = 6

Approach: Kadane’s Algorithm

We use a dynamic programming approach where we keep track of:

currSum: Maximum sum of subarray ending at current index
maxSum: Maximum sum found so far

At each step, we decide:

Either start a new subarray from current element
Or extend the previous subarray

Complexity Analysis

Time Complexity: O(n)
Space Complexity: O(1)
