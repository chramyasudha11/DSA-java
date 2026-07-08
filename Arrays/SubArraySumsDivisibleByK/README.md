Subarray Sums Divisible by K (LeetCode 974)
Approach

This problem is solved using Prefix Sum + HashMap.

Key Idea

Let:

prefixSum(i) = sum of elements from index 0 to i

For a subarray from l to r:

subarraySum = prefixSum(r) - prefixSum(l-1)

The subarray sum is divisible by k if:

(prefixSum(r) - prefixSum(l-1)) % k == 0

This means:

prefixSum(r) % k == prefixSum(l-1) % k

So whenever the same remainder appears again, every previous occurrence of that remainder forms a valid subarray.

Unlike LeetCode 523, here we count all such subarrays instead of checking if one exists.

Algorithm
Create a HashMap to store:
Key: Remainder (prefixSum % k)
Value: Frequency of that remainder.
Insert (0,1) into the map because a prefix sum divisible by k itself forms a valid subarray.
Traverse the array:
Update the prefix sum.
Compute the remainder.
If the remainder is negative, add k to make it positive.
If the remainder already exists:
Add its frequency to the answer.
Increase the frequency of the current remainder.
Return the total count.
Dry Run
Input
nums = [4,5,0,-2,-3,1]
k = 5

Initial:

map = {0=1}
prefixSum = 0
count = 0
Element	Prefix Sum	Remainder	Count Added	Total Count	Map
4	4	4	0	0	{0=1,4=1}
5	9	4	1	1	{0=1,4=2}
0	9	4	2	3	{0=1,4=3}
-2	7	2	0	3	{0=1,4=3,2=1}
-3	4	4	3	6	{0=1,4=4,2=1}
1	5	0	1	7	{0=2,4=4,2=1}

Answer:

7
Why do we use rem += k?

Java's % operator can return a negative remainder.

Example:

-2 % 5 = -2

But mathematically,

-2 mod 5 = 3

So we convert negative remainders:

if (rem < 0) {
    rem += k;
}

This ensures all equivalent remainders are represented consistently.
Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(min(n, k)) (up to O(n) in the worst case)
