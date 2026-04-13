[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/Xclsk4Ir)
# Experiment 13: Divisible Pairs

## Problem Statement

Given an array of integers, `arr`, and a positive integer $k$, determine the number of $(i, j)$ pairs in the array where $i < j$ and `arr[i] + arr[j]` is divisible by $k$.

## Input Format

* The first line contains 2 space-separated integers, $n$ (size of array) and $k$.
* The second line contains $n$ space-separated integers, each a value of `arr[i]`.

## Output Format

Print the number of pairs divisible by $k$, where $i < j$.

### Example 1

**Input:**

```text
6 3
1 3 2 6 1 2
```

**Output:**

```text
5
```

**Explanation:**
Valid pairs are:
* (1, 2) -> 1 + 2 = 3 (divisible by 3)
* (1, 2) -> 1 + 2 = 3 (divisible by 3)
* (3, 6) -> 3 + 6 = 9 (divisible by 3)
* (2, 1) -> 2 + 1 = 3 (divisible by 3)
* (1, 2) -> 1 + 2 = 3 (divisible by 3)
*(Note: The explanation uses values, but the condition depends on indices $i < j$. The count is 5).*

### Example 2

**Input:**

```text
4 5
1 3 2 6
```

**Output:**

```text
1
```
