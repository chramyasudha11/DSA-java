Majority Element

🧾 Problem Statement

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.

You may assume that the majority element always exists in the array.

🧪 Examples

Example 1

Input: nums = [3,2,3]
Output: 3

Example 2

Input: nums = [2,2,1,1,1,2,2]
Output: 2

🚀 Optimal Approach: Boyer–Moore Voting Algorithm
💡 Idea

We cancel out different elements against the majority element.
Since the majority element appears more than n/2 times, it always survives.

⚙️ Algorithm

Initialize:
candidate = 0
count = 0
Traverse the array:
If count == 0, update candidate
If current element == candidate → count++
Else → count--
Return candidate

Complexity Analysis

Time	O(n)
Space	O(1)
