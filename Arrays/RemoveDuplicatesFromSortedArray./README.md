Remove Duplicates from Sorted Array
Problem Statement

Given a sorted integer array nums, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be maintained.

Return the number of unique elements k, where the first k elements of nums contain the unique values in sorted order.

Example 1

Input:

nums = [1,1,2]

Output:

2

Modified Array:

[1,2,_]
Example 2

Input:

nums = [0,0,1,1,1,2,2,3,3,4]

Output:

5
Modified Array:

[0,1,2,3,4,_,_,_,_,_]
Approach

Since the array is already sorted, duplicate elements appear next to each other.

We use the Two Pointer Technique:

Pointer i keeps track of the last unique element.
Pointer j traverses the array.
When a new unique element is found (nums[j] != nums[i]):
Move i one step forward.
Copy the unique element to nums[i].
After traversal, the first i + 1 elements contain all unique values.


Dry Run

Input
nums = [1,1,2]
j	nums[j]	nums[i]	Action	Array
1	1	1	Duplicate, skip	[1,1,2]
2	2	1	Unique, copy	[1,2,2]

Return:
k = 2
First k elements:
[1,2]

Complexity Analysis

Time Complexity: O(n)
Space Complexity: O(1)

Key Concepts

Arrays
Two Pointers
In-Place Modification
Sorting Properties
