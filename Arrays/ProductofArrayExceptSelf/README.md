Product of Array Except Self (LeetCode 238)
Problem Statement

Given an integer array nums, return an array answer such that:

answer[i] is equal to the product of all the elements of nums except nums[i].
The solution must run in O(n) time.
Division is not allowed.
Approach

This solution uses the Prefix Product and Suffix Product technique.

Key Idea

For every index i:

answer[i] = (Product of all elements to the left of i)
            ×
            (Product of all elements to the right of i)

To achieve this:

left[i] stores the product of all elements before index i.
right[i] stores the product of all elements after index i.
Multiply left[i] and right[i] to get the final answer.
Algorithm
Create a left array.
Initialize left[0] = 1.

For each index i, compute:

left[i] = left[i-1] * nums[i-1]
Create a right array.
Initialize right[n-1] = 1.

Traverse from right to left:

right[i] = right[i+1] * nums[i+1]
Create the answer array.

For each index:

answer[i] = left[i] * right[i]
Return the answer array.
Dry Run
Input
nums = [1, 2, 3, 4]
Step 1: Build Left Product Array
Index	Left Product
0	1
1	1
2	2
3	6
left = [1, 1, 2, 6]
Step 2: Build Right Product Array
Index	Right Product
3	1
2	4
1	12
0	24
right = [24, 12, 4, 1]
Step 3: Compute Final Answer
Index	Left	Right	Answer
0	1	24	24
1	1	12	12
2	2	4	8
3	6	1	6
answer = [24, 12, 8, 6]
Example
Input
nums = [1,2,3,4]
Output
[24,12,8,6]

Explanation

Product except index 0: 2 × 3 × 4 = 24
Product except index 1: 1 × 3 × 4 = 12
Product except index 2: 1 × 2 × 4 = 8
Product except index 3: 1 × 2 × 3 = 6
Complexity Analysis
Time Complexity: O(n)
One pass for the left array.
One pass for the right array.
One pass to compute the answer.
Space Complexity: O(n)
Extra arrays left and right are used.
