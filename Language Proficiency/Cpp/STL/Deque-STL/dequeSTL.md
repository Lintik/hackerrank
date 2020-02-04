# Deque-STL

Double ended queue or Deque(part of C++ STL) are sequence containers with dynamic sizes that can be expanded or contracted on both ends (either its front or its back). The member functions of deque that are mainly used are:

+ Deque Template:
```c++
std::deque<value_type>
```
+ Declaration:
```c++
deque<int> mydeque; //Creates a double ended queue of deque of int type
```
+ Size
```c++
int length = mydeque.size(); //Gives the size of the deque
```
+ Push
```c++
mydeque.push_back(1); //Pushes element at the end
mydeque.push_front(2); //Pushes element at the beginning
```
+ Pop
```c++
mydeque.pop_back(); //Pops element from the end
mydeque.pop_front(); //Pops element from the beginning
```
+ Empty
```c++
mydeque.empty() //Returns a boolean value which tells whether the deque is empty or not
```
To know more about deque, click here

Given a set of arrays of size __*N*__
and an integer __*K*__, you have to find the maximum integer for each and every contiguous subarray of size __*K*__ for each of the given arrays.

__Input Format__

First line of input will contain the number of test cases T. For each test case, you will be given the size of array N and the size of subarray to be used K. This will be followed by the elements of the array A<sub>i</sub>.

__Contraints__
> __1 &le; *T* &le; 1000__
__1 &le; *N* &le; 10000__  
__1 &le; *K* &le; *N*__  
__1 &le; *A*<sub>*i*</sub> &le; 10000__, where __*A*<sub>*i*</sub>__ is the __*i<sup>th</sup>*__ element in the array __*A*__

__Sample Input__
```
2
5 2
3 4 6 3 4
7 4
3 4 5 8 1 4 10
```
__Output Format__
```
4 6 6 4
8 8 8 10
```
For the first case, the contiguous subarrays of size 2 are {3,4},{4,6},{6,3} and {3,4}. The 4 maximum elements of subarray of size 2 are: 4 6 6 4.

For the second case,the contiguous subarrays of size 4 are {3,4,5,8},{4,5,8,1},{5,8,1,4} and {8,1,4,10}. The 4 maximum element of subarray of size 4 are: 8 8 8 10.
