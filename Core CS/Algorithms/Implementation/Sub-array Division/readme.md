### __Sub-array Division__

Given a chocolate bar, two children, Lily and Ron, are determining how to share it. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

- The length of the segment matches Ron's birth month, and,
- The sum of the integers on the squares is equal to his birth day.

You must determine how many ways she can divide the chocolate.

Consider the chocolate bar as an array of squares, `s = [2, 2, 1,3, 2]`. She wants to find segments summing to Ron's birth day, `d = 4` with a length equalling his birth month, `m = 2`. In this case, there are two segments meeting her criteria: `[2, 2]` and `[1, 3]`.

__Function Description__

Complete the birthday function in the editor below. It should return an integer denoting the number of ways Lily can divide the chocolate bar.

birthday has the following parameter(s):

- s: an array of integers, the numbers on each of the squares of chocolate
- d: an integer, Ron's birth day
- m: an integer, Ron's birth month

__Input Format__

The first line contains an integer `n`, the number of squares in the chocolate bar.
The second line contains `n` space-separated integers `s[i]`, the numbers on the chocolate squares where 0 &le; _i_ &le; _n_.
The third line contains two space-separated integers, `d` and `m`, Ron's birth day and his birth month.

__Constraints__

- 1 &le; _n_ &le; 100
- 1 &le; _s_[_i_] &le; 5, where (0 &le; _i_ &le; _n_)
- 1 &le; _d_ &le; 31
- 1 &le; _m_ &le; 12

__Output Format__

Print an integer denoting the total number of ways that Lily can portion her chocolate bar to share with Ron.

__Sample Input 0__

```
5
1 2 1 3 2
3 2
```

__Sample Output 0__
```
2
```

__Sample Input 1__
```
6
1 1 1 1 1 1
3 2
```

__Sample Output 1__
```
0
```

__Sample Input 2__

```
1
4
4 1
```

__Sample Output 2__
```
1
```