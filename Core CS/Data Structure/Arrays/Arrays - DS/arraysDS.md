# Arrays - DS

An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, __*A*__, of size __*N*__, each memory location has some unique index, __*i*__(where __0 &le; *i* &lt; *N*__), that can be referenced as __*A*<sub>*i*</sub>__(you may also see it written as __*A*[*i*]__).

Given an array, __*A*__, of __*N*__ integers, print each element in reverse order as a single line of space-separated integers.

__Note:__ If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

__Input Format__

The first line contains an integer, __*N*__ (the number of integers in __*A*__.
The second line contains __*N*__ space-separated integers describing __*A*__.

__Constraints__
+ __1 &le; *N* &le; 1000__
+ __1 &le; *A*<sub>*i*</sub> &le; 10000__

__Output Format__

Print  __*N*__ integers in __*A*__ in reverse order as a single line of space-separated integers. 

__Sample Input 1__

```
4
1 4 3 2
```
__Sample Output 1__
```
2 3 4 1
```