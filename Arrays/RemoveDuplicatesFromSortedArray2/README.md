Problem Statement

Given a sorted integer array nums, remove duplicates in-place such that each unique element appears at most twice.

The relative order of the elements must remain unchanged.

Return the number of valid elements k, where the first k positions of the array contain the final result.

Example 1

Input

nums = [1,1,1,2,2,3]

Output

k = 5
nums = [1,1,2,2,3,_]

Explanation

1 appears 3 times → keep only 2.
2 appears 2 times → keep both.
3 appears 1 time → keep it.

Final valid array:

[1,1,2,2,3]
Example 2

Input

nums = [0,0,1,1,1,1,2,3,3]

Output

k = 7
nums = [0,0,1,1,2,3,3,_,_]
Approach

Since the array is already sorted:

Duplicate values occur consecutively.
We can use the Two Pointer (Read-Write Pointer) technique.
One pointer scans the array.
Another pointer keeps track of where the next valid element should be placed.

The first two elements are always valid because each number may appear up to two times.

For every subsequent element:

If adding it would create a third occurrence of the same number, skip it.
Otherwise, place it at the write position.
Algorithm
If the array size is less than or equal to 2, return its length.
Initialize a write pointer at index 2.
Traverse the array starting from index 2.
For each element:
Check whether it should be kept.
If valid, write it to the current write position.
Move the write pointer forward.
Return the write pointer as the final length.
Dry Run
nums = [1,1,1,2,2,3]

Initially:

Valid elements: [1,1]
write = 2

Process remaining elements:

1 → third occurrence → skip

2 → keep
[1,1,2]

2 → keep
[1,1,2,2]

3 → keep
[1,1,2,2,3]

Return:

5
Complexity Analysis
Complexity	Value
Time	O(n)
Space	O(1)
