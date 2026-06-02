# Move Zeroes

## Problem Statement

Given an integer array `nums`, move all `0`s to the end of it while maintaining the relative order of the non-zero elements.

You must do this **in-place** without making a copy of the array.

### Example 1

**Input:**

```text
nums = [0,1,0,3,12]
```

**Output:**

```text
[1,3,12,0,0]
```

### Example 2

**Input:**

```text
nums = [0]
```

**Output:**

```text
[0]
```

---

## Approach

Use the **Two Pointer Technique**.

* Maintain a pointer `index` to track the position where the next non-zero element should be placed.
* Traverse the array.
* Whenever a non-zero element is found:

  * Place it at `nums[index]`.
  * Increment `index`.
* After processing all elements, fill the remaining positions with `0`.
---

## Dry Run

### Input

```text
nums = [0,1,0,3,12]
```

### Traversal

| i | nums[i] | Action           | Array State   |
| - | ------- | ---------------- | ------------- |
| 0 | 0       | Skip             | [0,1,0,3,12]  |
| 1 | 1       | Place at index 0 | [1,1,0,3,12]  |
| 2 | 0       | Skip             | [1,1,0,3,12]  |
| 3 | 3       | Place at index 1 | [1,3,0,3,12]  |
| 4 | 12      | Place at index 2 | [1,3,12,3,12] |

Fill remaining positions with zeros:

```text
[1,3,12,0,0]
```

---

## Complexity Analysis

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## Key Concepts

* Arrays
* Two Pointers
* In-Place Modification
* Efficient Traversal
