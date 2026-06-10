Problem Statement

Given an array of integers nums and an integer k, find the contiguous subarray of size k that has the maximum average value and return this value.

Example

Input

nums = [1, 12, -5, -6, 50, 3]
k = 4

Output

12.75

Explanation
Subarray [12, -5, -6, 50] has the maximum sum, hence maximum average.

Approach Overview

Since we need the sum of every subarray of size k, recomputing the sum for each window would be inefficient.

Instead, we use a sliding window technique:

Compute sum of first k elements.
Slide the window one element at a time.
Update sum by removing the left element and adding the new right element.
Track the maximum sum encountered.
Key Idea

For each new window:

newSum=previousSum+newElement−oldElement
Algorithm Steps
Compute sum of first k elements.
Initialize maxSum = curSum.
Slide window from index k to end:
Add nums[i]
Subtract nums[i - k]
Update maxSum
Return maxSum / k.

Complexity Analysis
Operation	Complexity
Time	O(n)
Space	O(1)
