Problem Statement

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number, also sorted in non-decreasing order.

📌 Example
Example 1:
Input:  nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:
Input:  nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
💡 Approach
🔥 Optimal Solution: Two Pointers

Since the array is sorted:

Negative numbers are on the left
Positive numbers are on the right
The largest square will always come from either end
Steps:
Use two pointers: left and right
Compare absolute squares of both ends
Fill result array from the back
Move pointers accordingly

🚀 Algorithm

left = 0
right = n - 1
k = n - 1

while left <= right:
    if square(left) > square(right):
        result[k] = square(left)
        left++
    else:
        result[k] = square(right)
        right--
    k--

Time
O(n)
Space
O(n)
