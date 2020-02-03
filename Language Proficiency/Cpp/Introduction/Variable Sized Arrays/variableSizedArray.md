# Variable Sized Arrays

Consider an __*n*__-element array, __*a*__, where each index __*i*__ in the array contains a reference to an array of __*k<sub>i</sup>*__ integers (where the value of __*k<sub>i</sup>*__ varies from array to array). See the *Explanation* section below for a diagram.

Given __*a*__, you must answer __*q*__ queries. Each query is in the format `i j`, where __*i*__ denotes an index in array __*a*__ and __*j*__ denotes an index in the array located at __*a*[i]__. For each query, find and print the value of element __*j*__ in the array at location __*a*[i]__ on a new line.

Click here to know more about how to create variable sized arrays in C++.

**Input Format**

The first line contains two space-separated integers denoting the respective values of __*n*__ (the number of variable-length arrays) and __*q*__ (the number of queries).  
Each line __*i*__ of the __*n*__ subsequent lines contains a space-separated sequence in the format __k a[i]<sub>0</sub> a[i]<sub>1</sub> ... a[i]<sub>k-1</sub>__ describing the __*k*__-element array located at __*a*[i]__.  
Each of the __*q*__ subsequent lines contains two space-separated integers describing the respective values  __*i*__ (an index in array __*a*__) and __*j*__ (an index in the array referenced by __*a*[i]__) for a query.

**Constraints**

* __1 &le; *n* &le; 100000__
* __1 &le; *q* &le; 100000__
* __1 &le; &forall;*k* &le; 300000__
* __*n* &le; &sum;*k* &le; 300000__
* __0 &le; &forall;*i* &le; *n*__
* __0 &le; &forall;*j* &le; *k*__
* All indices in this challenge are zero-based.
* All the given numbers are non negative and are not greater than __10<sup>6</sup>__

**Output Format**

For each pair of __*i*__ and __*j*__ values (i.e., for each query), print a single integer denoting the element located at index __*j*__ of the array referenced by __*a*[*i*]__. There should be a total of __*q*__ lines of output.

**Sample Input**

```
2 2
3 1 5 4
5 1 2 8 9 3
0 1
1 3
```
**Sample Output**

```
5
9
```
**Explanation**

The diagram below depicts our assembled Sample Input:

We perform the following __q = 2__ queries:

1. Find the array located at index __*i* = 0__, which corresponds to __*a*[0] = [1,5,4]__. We must print the value at index __*j* = 1__ of this array which, as you can see, is __5__.

2. Find the array located at index __*i* = 1__, which corresponds to __*a* = [1,2,8,9,3]__. We must print the value at index __*j* = 3__ of this array which, as you can see, is __9__.


