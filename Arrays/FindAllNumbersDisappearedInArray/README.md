Find All Numbers Disappeared in an Array
🧾 Problem Statement

Given an array nums of size n, where each element is in the range [1, n], return all numbers in the range [1, n] that do not appear in the array.

🧪 Examples
Example 1
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2
Input: nums = [1,1]
Output: [2]
🚀 Best Approach: In-place Marking (Optimal)
💡 Idea

We use the array itself as a hash marker.

Since numbers are in range [1, n], we mark visited numbers by making the value at index num-1 negative.

After marking:

Positive values → index not visited → missing numbers
⚙️ Steps
Traverse array
For each number num, mark index abs(num) - 1 as negative
Second pass:
If value at index i is positive → i + 1 is missing
Initial Array
Index:  0  1  2  3  4  5  6  7
Nums : [4, 3, 2, 7, 8, 2, 3, 1]
🔁 Step-by-step Marking
i = 0 → num = 4
index = 3
mark nums[3] → -7
[4, 3, 2, -7, 8, 2, 3, 1]
i = 1 → num = 3
index = 2
mark nums[2] → -2
[4, 3, -2, -7, 8, 2, 3, 1]
i = 2 → num = -2 → abs = 2
index = 1
mark nums[1] → -3
[4, -3, -2, -7, 8, 2, 3, 1]
i = 3 → num = -7 → abs = 7
index = 6
mark nums[6] → -3
[4, -3, -2, -7, 8, 2, -3, 1]
i = 4 → num = 8
index = 7
mark nums[7] → -1
[4, -3, -2, -7, 8, 2, -3, -1]
i = 5 → num = 2
index = 1 (already negative)
[4, -3, -2, -7, 8, 2, -3, -1]
i = 6 → num = -3 → abs = 3
index = 2 (already negative)
[4, -3, -2, -7, 8, 2, -3, -1]
i = 7 → num = -1 → abs = 1
index = 0
mark nums[0] → -4
[-4, -3, -2, -7, 8, 2, -3, -1]
🔍 Final Array
[-4, -3, -2, -7, 8, 2, -3, -1]
📌 Find Missing Numbers

We check all indices:

Index 	Value 	Missing?
0	       -4     	No
1	       -3	      No
2	       -2	      No
3      	 -7	      No
4	        8	      ❌ YES → 5
5	        2	      ❌ YES → 6
6	       -3	      No
7	       -1	      No

🏁 Final Output

[5, 6]
📊 Complexity Analysis

Type	Complexity
Time	O(n)
Space	O(1) 
