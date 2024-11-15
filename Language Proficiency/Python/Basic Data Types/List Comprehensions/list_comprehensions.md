Let's learn about list comprehensions! You are given three integers $x$, $y$ and $z$ representing the dimensions of a cuboid along with an integer $n$. Print a list of all possible coordinates given by $(i,j,k)$ on a 3D grid where the sum $i + j + k$ of is not equal to $n$. Here, $0 \le i \le x;0 \le j \le y; 0 \le k \le z$. Please use list comprehensions rather than multiple loops, as a learning exercise.

__Example__

$x = 1$

$y = 1$

$z = 2$

$n = 3$

All permutations of $ \left[ i,j,k \right] $ are:

$ \left[ \left[ 0,0,0 \right], \left[ 0,0,1 \right],\left[ 0,0,2 \right],\left[ 0,1,0 \right],\left[ 0,1,1 \right],\left[ 0,1,2 \right],\left[ 1,0,0 \right],\left[ 1,0,1 \right],\left[ 1,0,2 \right],\left[ 1,1,0 \right],\left[ 1,1,1 \right],\left[ 1,1,2 \right] \right] $ 

Print an array of the elements that do not sum to $n = 3$.

$ \left[ \left[ 0,0,0 \right], \left[ 0,0,1 \right],\left[ 0,0,2 \right],\left[ 0,1,0 \right],\left[ 0,1,1 \right],\left[ 1,0,0 \right],\left[ 1,0,1 \right],\left[ 1,1,0 \right],\left[ 1,1,2 \right] \right] $ 

__Input Format__

Four integers $x$, $y$, $z$ and $n$, each on a separate line.

__Constraints__

Print the list in lexicographic increasing order.

__Sample Input 0__
```python
1
1
1
2
```
__Sample Output 0__
```python
[[0, 0, 0], [0, 0, 1], [0, 1, 0], [1, 0, 0], [1, 1, 1]]
```
__Explanation 0__

Each variable x, y and z will have values of 0 or 1. All permutations of lists in the form $\left[ i,j,k \right] = \left[ 0,0,0 \right],\left[ 0,0,1 \right],\left[ 0,1,0 \right],\left[ 0,1,1 \right],\left[ 1,0,0 \right],\left[ 1,0,1 \right], \left[ 1,0,0 \right],\left[ 1,0,1 \right], \left[ 1,1,1 \right]$. Remove all arrays that sum to $n = 2$ to leave only the valid permutations.

__Sample Input 1__
```
2
2
2
2
```
__Sample Output 1__
```python
[[0, 0, 0], [0, 0, 1], [0, 1, 0], [0, 1, 2], [0, 2, 1], [0, 2, 2], [1, 0, 0], [1, 0, 2], [1, 1, 1], [1, 1, 2], [1, 2, 0], [1, 2, 1], [1, 2, 2], [2, 0, 1], [2, 0, 2], [2, 1, 0], [2, 1, 1], [2, 1, 2], [2, 2, 0], [2, 2, 1], [2, 2, 2]]
```