### __Divisible Sum Pairs__

You are given an array of `n` integers, `ar = [ ar[0], ar[1], ..., ar[n-1]]`, and a positive integer, `k`. Find and print the number of (i, j) pairs where `i < j` and `ar[i] + ar[j]` is divisible by `k`.

For example, `ar = [1, 2, 3, 4, 5, 6]` and `k = 5`. Our three pairs meeting the criteria are `[1, 4]`, `[2, 3]` and `[4, 6]`.

__Function Description__

Complete the divisibleSumPairs function in the editor below. It should return the integer count of pairs meeting the criteria.

divisibleSumPairs has the following parameter(s):

- n: the integer length of array `ar`
- ar: an array of integers
- k: the integer to divide the pair sum by

__Input Format__

The first line contains `2` space-separated integers, `n` and `k`.
The second line contains `n` space-separated integers describing the values of `ar = [ ar[0], ar[1], ..., ar[n-1]]`

__Contraints__
- 2 &le; _n_ &le; 100
- 1 &le; _k_ &le; 100
- 1 &le; _ar_[_i_] &le; 100

__Output Format__

Print the number of `(i, j)` pairs where `i < j` and `ar[i] + ar[j]` is evenly divisible by `k`.

__Sample Input__
```
6 3
1 3 2 6 1 2
```
__Sample Output__
```
5
```