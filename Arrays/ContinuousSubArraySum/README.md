Continuous Subarray Sum (LeetCode 523)
Problem Statement

Given an integer array nums and an integer k, return true if there exists a continuous subarray of length at least 2 whose sum is a multiple of k. Otherwise, return false.

Approach

This problem is solved using the Prefix Sum + HashMap technique.

Key Idea

Let:

prefixSum(i) = sum of elements from index 0 to i

For a subarray from index l to r:

subarraySum = prefixSum(r) - prefixSum(l-1)

The subarray sum is a multiple of k if:

(prefixSum(r) - prefixSum(l-1)) % k == 0

This implies:

prefixSum(r) % k == prefixSum(l-1) % k

So, whenever the same remainder appears again, the elements between those two indices form a subarray whose sum is divisible by k.

Algorithm
Create a HashMap to store:
Key: Remainder (prefixSum % k)
Value: First index where the remainder appeared.
Insert (0, -1) into the map to handle subarrays starting from index 0.
Traverse the array:
Update the running prefix sum.
Compute the remainder.
If the remainder already exists:
Check whether the subarray length is at least 2.
If yes, return true.
Otherwise, store the current index for that remainder.
If no valid subarray is found, return false.
Dry Run
Example
nums = [23,2,4,6,7]
k = 6

Initial:

map = {0=-1}
prefixSum = 0
i = 0
prefixSum = 23

rem = 23 % 6 = 5

map = {0=-1, 5=0}
i = 1
prefixSum = 25

rem = 1

map = {0=-1, 5=0, 1=1}
i = 2
prefixSum = 29

rem = 5

5 already exists at index 0

distance = 2 - 0 = 2

>=2

return true

Subarray:

[2,4]

sum = 6

6 % 6 = 0
Why map.put(0, -1)?

Suppose:

nums = [6,6]
k = 6

At i = 1:

prefixSum = 12

rem = 0

Since the map contains:

0 -> -1

Distance:

1 - (-1) = 2

So the subarray [6,6] is correctly detected.

Without map.put(0, -1), subarrays starting at index 0 would not be handled correctly.

Complexity
Time: O(n)
Space: O(min(n, k)) in practice (up to O(n))

This is the optimal solution using the Prefix Sum + HashMap (remainder) pattern.
