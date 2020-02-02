# Arrays Introduction

An array is a series of elements of the same type placed in contiguous memory locations that can be individually referenced by adding an index to a unique identifier.

Declaration:

```c++
int arr[10]; //Declares an array named arr of size 10, i.e; you can store 10 integers.
```
Accessing elements of an array:

```
Indexing in arrays starts from 0.So the first element is stored at arr[0],the second element at arr[1]...arr[9]
```
You'll be given an array __*N*__ of integers and you have to print the integers in the reverse order.

**Input Format** 

The first line of the input contains __*N*__,where __*N*__ is the number of integers.The next line contains __*N*__ integers separated by a space.

**Constraints**

> __1 &le; *N* &le; 1000__  
__1 &le; *A*<sub>*i*</sub> &le; 10000__, where __*A*<sub>*i*</sub>__ is the __*i*__<sup>__*th*__</sup> integer in the array.

**Output Format**  

Print the integers of the array in the reverse order in a single line separated by a space.

**Sample Input**
```
4
1 4 3 2
```
**Sample Output**
```
2 3 4 1
```

