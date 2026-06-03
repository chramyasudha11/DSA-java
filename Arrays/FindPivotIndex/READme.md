Problem Statement

Given an integer array nums, return the pivot index.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the right of the index.

If no such index exists, return -1.
Example 1

Input

nums = [1,7,3,6,5,6]

Output

3

Explanation

Left Sum  = 1 + 7 + 3 = 11
Right Sum = 5 + 6 = 11
Example 2

Input

nums = [1,2,3]

Output

-1
Approach (Prefix Sum)

Idea

Calculate the total sum of the array.
Maintain a running leftSum.
For each index:
Compute rightSum = totalSum - leftSum - nums[i]
If leftSum == rightSum, return the current index.
Otherwise, add nums[i] to leftSum.

Algorithm

Find the total sum of the array.
Initialize leftSum = 0.
Traverse the array:
Calculate rightSum.
Compare leftSum and rightSum.
If equal, return the current index.
Update leftSum.
If no pivot index is found, return -1.
Index	Left Sum	Current Element	Right Sum
0	0	1	27
1	1	7	20
2	8	3	17
3	11	6	11
leftSum == rightSum
11 == 11

Time Complexity
Calculating total sum: O(n)
Finding pivot index: O(n)

Overall TC = O(n)

Space Complexity
Uses only a few variables.

SC = O(1)
