# Two Pointers Pattern

## 📘 Overview
The **Two Pointers** technique is a powerful pattern used to solve array and string problems efficiently. It involves using two indices (called pointers) that traverse the data structure under certain conditions. This method helps reduce time complexity by eliminating the need for nested loops.

---

## 💡 When to Use Two Pointers

Use this technique when:
- You need to **find pairs, triplets, or subarrays** that meet specific conditions.
- The **data is sorted** or can be sorted.
- You want to **optimize a brute-force O(n²)** solution to **O(n)** or **O(n log n)**.

---

## ⚙️ How It Works

1. **Initialize two pointers** — usually `left` and `right`.
2. **Check a condition** based on the values at these pointers.
3. **Move the pointers**:
   - If the condition is not met → move one pointer to try another combination.
   - If the condition is met → record the result and move pointers to find more.
4. **Stop** when the pointers cross or reach the end of the array.

---

## 🧭 Typical Approaches

### 1. Opposite Ends
- One pointer starts at the beginning, the other at the end.
- Common for problems like finding pairs that sum to a target or finding container area.
  
### 2. Same Direction
- Both pointers start from the same end, but one moves faster.
- Useful for problems involving sliding windows or removing duplicates.

---

## ⏱️ Time Complexity
Usually **O(n)** or **O(n log n)**, depending on sorting requirements.

---

## 🔍 Example Problems

| #  | Problem Name | Platform | Link / ID |
|----|---------------|-----------|------------|
| 1  | Remove Duplicates from Sorted Array | LeetCode | 26 |
| 2  | Two Sum II – Input Array Is Sorted | LeetCode | 167 |
| 3  | Move Zeroes | LeetCode | 283 |
| 4  | Reverse String | LeetCode | 344 |
| 5  | Container With Most Water | LeetCode | 11 |
| 6  | Valid Palindrome | LeetCode | 125 |
| 7  | Squares of a Sorted Array | LeetCode | 977 |
| 8  | Subarray Product Less Than K | LeetCode | 713 |
| 9  | Remove Element | LeetCode | 27 |
| 10 | 3Sum | LeetCode | 15 |
| 11 | Sort Colors (Dutch National Flag Problem) | LeetCode | 75 |
| 12 | Longest Substring Without Repeating Characters | LeetCode | 3 |
| 13 | Minimum Size Subarray Sum | LeetCode | 209 |
| 14 | Trapping Rain Water | LeetCode | 42 |
| 15 | Longest Mountain in Array | LeetCode | 845 |

---

## 🧠 Key Insights

- Two Pointers help avoid redundant checks and unnecessary nested loops.
- Work best when the data is **sorted** or can be **processed linearly**.
- Common in problems involving **arrays, strings, and linked lists**.

---

