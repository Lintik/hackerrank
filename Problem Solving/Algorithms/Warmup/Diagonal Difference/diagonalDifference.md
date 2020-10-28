Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix ___arr___ is shown below:

```
1 2 3
4 5 6
9 8 9
```

The left-to-right diagonal = __1 + 5 + 9 = 15__. The right to left diagonal = __3 + 5 + 9 = 17__. Their absolute difference is __|15 - 17| = 2__. 

__Function description__

Complete the ___diagonalDiffence__ function in the editor below.  
diagonalDifference takes the following parameter: 
- int arr[n][m]: an array of integers

__Return__
- int: the absolute diagonal difference

__Input Format__

The first line contains a single integer, ___n___, the number of rows and columns in the square matrix ___arr___.

Each of the next ___n___ lines describes a row, ___arr_[_i_]__, and consists of ___n___ space-separated integers ___arr_[_i_][_j_]__.

__Constraints__

- __-100 &le; _arr_[_i_][_j_] &le; 100__

__Output Format__

Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

__Sample Input__

```
3
11 2 4
4 5 6
10 8 -12
```

__Sample Output__
```
15
```

__Explanation__

The primary diagonal is: 

```
11
   5
     -12
```

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

```
     4
   5
10
```

Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15