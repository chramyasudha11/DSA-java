# Contains Duplicate II

## Problem Statement

Given an integer array `nums` and an integer `k`, return `true` if there are two distinct indices `i` and `j` in the array such that:

- `nums[i] == nums[j]`
- `abs(i - j) <= k`

Otherwise, return `false`.

### Examples

#### Example 1

```text
Input: nums = [1,2,3,1], k = 3
Output: true
```

#### Example 2

```text
Input: nums = [1,0,1,1], k = 1
Output: true
```

#### Example 3

```text
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
```

---

## Approach (Brute Force with Limited Range)

For each element, compare it with the next `k` elements only.

Since we only care about duplicates whose indices differ by at most `k`, there is no need to check elements beyond that range.

### Algorithm

1. Iterate through the array using index `i`.
2. For each `i`, check elements from `i + 1` up to `i + k`.
3. If any element matches `nums[i]`, return `true`.
4. If no valid pair is found after all iterations, return `false`.

---
