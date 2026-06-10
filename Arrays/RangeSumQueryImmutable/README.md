Problem Statement

Given an integer array nums, efficiently answer multiple queries that ask for the sum of elements between two indices left and right (inclusive).

Implement a NumArray class with:

NumArray(int[] nums) → Initializes the object with the array.
sumRange(int left, int right) → Returns the sum of elements from index left to right.
Example

Input

nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2)
sumRange(2, 5)
sumRange(0, 5)

Output

1
-1
-3

Approach Overview

Since there can be many range sum queries, recalculating the sum for every query would be inefficient.

The goal is to preprocess the array once during initialization so that each query can be answered quickly.

This optimization reduces the query time significantly and is a common technique used in range query problems.

Key Concepts

Array Traversal
Prefix Sum
Range Query Optimization
Preprocessing

Complexity

Operation	Time Complexity

Initialization	O(n)
sumRange Query	O(1)
