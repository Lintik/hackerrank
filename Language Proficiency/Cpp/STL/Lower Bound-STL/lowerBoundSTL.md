# Lower Bound-STL

You are given __*N*__ integers in the sorted order. Then you are given __*Q*__ queries. In each query you will be given an integer and you have to tell whether that integer is present in the array, if so you have to tell at which index it is present and if it is not present you have to tell the index at which the smallest integer that is just greater than the given number is present.  
Lower bound is a function that can be used with a sorted vector. Learn how to use lower bound to solve
this problem by Clicking Here.

**Input Format**

The first line of the input contains the number of integers __*N*__. The next line contains __*N*__ integers in sorted order. The next line contains __*Q*__, the number of queries. Then lines follow each containing a single integer __*Y*__.  
Note that if the same number is present multiple times, you have to print the first index at which it
occurs. Also, the input is such that you always have an answer for each query.

**Constraints**
> __1 &le; *N* &le; 10000__   
__1 &le; *X<sub>i</sub>* &le; 10000__, where __*X<sub>i</sub>*__ is __*i<sup>th</sup>*__ element in the array  
__1 &le; *Q* &le; 10000__  
__1 &le; *Y* &le; 10000__  

**Output Format**

For each query you have to print "Yes"(without the quotes) if the number is present and at which index(1-based) it is present separated by a space.

If the number is not present you have to print "No"(without the quotes) followed by the index of the next
smallest number just greater than that number.

You have to output each query in a new line.

**Sample Input**

```
8
1 1 2 2 6 9 9 15
4
1
4
9
15
```
**Sample Output**

```
Yes 1
No 5
Yes 6
Yes 8
```

