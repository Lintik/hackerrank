
__Task__

Given an integer, $n$, perform the following conditional actions:

* If $n$ is odd, print `Weird`
* If $n$ is even and in the inclusive range of $2$ to $5$, print `Not Weird`
* If $n$ is even and in the inclusive range of $6$ to $20$, print `Weird`
If $n$ is even and greater than $20$, print `Not Weird`

__Input Format__

A single line containing a positive integer, $n$

__Constraints__ 

* 1 $\leq$ $n$ $\leq$ 100


__Output Format__

Print `Weird` if the number is weird. Otherwise, print `Not Weird`.

__Sample Input 0__

```
3
```

__Sample Output 0__

```
Weird
```

__Explanation 0__

$n$ = 3

$n$ is odd and odd numbers are weird, so print `Weird`.

__Sample Input 1__
```
24
```
__Sample Output 1__
```
Not Weird
```
__Explanation 1__

$n = 24$

$n$ $\gt$ and $n$ is even, so it is not weird.