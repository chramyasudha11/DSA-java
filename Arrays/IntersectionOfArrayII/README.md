Problem Statement

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result should appear as many times as it shows in both arrays.

👉 The result can be returned in any order.

📌 Example
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
💡 Approach: HashMap (Frequency Counting)
Idea:

We use a HashMap to store frequency of elements in nums1, then:

Traverse nums2
If element exists in map with frequency > 0:
Add to result
Decrease frequency

This ensures duplicates are handled correctly.

🚀 Algorithm
Build frequency map for nums1
Traverse nums2
If element exists in map and count > 0:
Add to result list
Decrease count in map
Convert list → array

Complexity Analysis
⏱ Time Complexity:
Building HashMap → O(n)
Traversing nums2 → O(m)
Converting list → O(k)

👉 Final:

O(n + m)
💾 Space Complexity:
HashMap → O(n)
Result list → O(k)

👉 Final:

O(n + k)
