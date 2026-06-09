# 1266. Minimum Time Visiting All Points

## Approach

For every pair of consecutive points:

- Let:
  - `dx = |x2 - x1|`
  - `dy = |y2 - y1|`

### Observation

1. Use diagonal moves as much as possible.
   - Number of diagonal moves = `min(dx, dy)`

2. After diagonal moves, one coordinate reaches the target.
   - Remaining distance = `|dx - dy|`

3. Cover the remaining distance using horizontal or vertical moves.

Therefore,

```text
Time = min(dx, dy) + |dx - dy|
```

### Example

From `(1,1)` to `(4,3)`:

```text
dx = 3
dy = 2

Diagonal Moves = min(3,2) = 2
Remaining Moves = |3-2| = 1

Total Time = 2 + 1 = 3
---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

We traverse the points array once.

### Space Complexity

```text
O(1)
```

Only constant extra space is used.

---

## Key Idea

- First move diagonally as many times as possible.
- Then move horizontally or vertically for the remaining distance.

Formula:

```text
Time = min(dx, dy) + |dx - dy|
```

which is mathematically equivalent to:

```text
Time = max(dx, dy)
```

but this solution derives the answer using the actual movement process.
