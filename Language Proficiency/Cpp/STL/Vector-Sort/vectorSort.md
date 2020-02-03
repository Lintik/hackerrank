# Vector-Sort

You are given __*N*__ integers. Sort the __*N*__ integers and print the sorted order.  
Store the __*N*__ integers in a vector. Vectors are sequence containers representing arrays that can change in size.
+ Declaration:
```c++
vector<int>v; //(creates an empty vector of integers)
```
+ Size:
```c++
int size=v.size(); 
```
+ Pushing an integer into a vector:
```c++
v.push_back(x);//(where x is an integer.The size increases by 1 after this.)
```
+ Popping the last element from the vector:
```c++
v.pop_back(); //(After this the size decreases by 1)
```
+ Sorting a vector:
```c++
sort(v.begin(),v.end()); //(Will sort all the elements in the vector)
```

To know more about vectors, Click Here

**Input Format**

The first line of the input contains __*N*__ where __*N*__ is the number of integers. The next line contains
integers.

**Constraints**
> __1 &le; __*N*__ &le; 100000__  
__1 &le; __*V*<sub>*i*</sub>__ &le; 10<sup>9</sup>__, where __*V*<sub>*i*</sub>__ is the ith element in the vector

**Output Format**

Print the integers in the sorted order one by one in a single line followed by a space.

**Sample Input**
```
5
1 6 10 8 4
```
**Sample Output**
```
1 4 6 8 
```