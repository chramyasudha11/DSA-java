Problem Statement

Given an array nums containing only:

0 → Red
1 → White
2 → Blue

Sort the array in-place so that objects of the same color are adjacent and arranged in the order:

0s → 1s → 2s

You must not use the built-in sorting function and should aim for a one-pass solution with constant extra space.

Example 1

Input

nums = [2,0,2,1,1,0]

Output

[0,0,1,1,2,2]
Example 2

Input

nums = [2,0,1]

Output

[0,1,2]
Approach

This problem can be solved using the Dutch National Flag Algorithm.

The idea is to divide the array into three regions:

Left region → contains all 0s
Middle region → contains all 1s
Right region → contains all 2s

Three pointers are used:

low → position where the next 0 should be placed
mid → current element being processed
high → position where the next 2 should be placed
Algorithm
Initialize:
low = 0
mid = 0
high = n - 1
Traverse while mid <= high.
For each element:
If value is 0:
Swap with low
Increment both low and mid
If value is 1:
Increment mid
If value is 2:
Swap with high
Decrement high
Do not increment mid
Continue until all elements are processed
Dry Run
Input
[2,0,2,1,1,0]

Initial:

low = 0
mid = 0
high = 5

Process:

[2,0,2,1,1,0]
 ↑         ↑
mid      high

Swap 2 with 0 at high:

[0,0,2,1,1,2]

Move pointers accordingly and continue.

Final array:

[0,0,1,1,2,2]

Complexity Analysis
Complexity	Value
Time	O(n)
Space	O(1)
