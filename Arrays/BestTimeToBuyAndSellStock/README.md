# 📈 Stock Buy and Sell (Max Profit)

This repository contains an efficient Java solution to the **Stock Buy and Sell problem**, where the goal is to maximize profit by choosing the best days to buy and sell stock.

---

## 🚀 Problem Statement

You are given an array `prices[]` where `prices[i]` represents the stock price on the i-th day.

You need to find the **maximum profit** by:
- Buying once on a day
- Selling on a later day

👉 Only one transaction is allowed.

---
## 💡 Approach (Optimized - One Pass)

### Key Idea:
- Track the **minimum price seen so far**
- At each step, calculate profit if we sell today
- Update maximum profit

This avoids checking all pairs (no nested loops).

---
## 🧠 Algorithm

1. Initialize:
   - `minPrice = +∞`
   - `maxProfit = 0`
2. Traverse the array:
   - Update `minPrice` if current price is smaller
   - Otherwise calculate profit = `price - minPrice`
   - Update `maxProfit`

---

## ⏱️ Comp
