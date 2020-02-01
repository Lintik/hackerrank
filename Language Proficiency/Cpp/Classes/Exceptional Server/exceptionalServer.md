# Exceptional Server

Your friend set up a small computational server that performs complex calculations.
It has a function that takes __2__ large numbers as its input and returns a numeric result. Unfortunately, there are various exceptions that may occur during execution.

Complete the code in your editor so that it prints appropriate error messages, should anything go wrong. The expected behavior is defined as follows:

* If the compute function runs fine with the given arguments, then print the result of the function call.
* If it fails to allocate the memory that it needs, print `Not enough memory.`
* If any other standard C++ exception occurs, print Exception: S where __S__ is the exception's error message. 
* If any non-standard exception occurs, print Other `Exception`

__Input Format__

The first line contains an integer, __*T*__, the number of test cases.
Each of __T__ the subsequent lines describes a test case as __2__ space-separated integers, __*A*__ and __*B*__, respectively.

__Constraints__

> 1 &le; T &le; 10<sup>3</sup>  
0 &le; A, B &le; 2<sup>60</sup>

__output Format__

For each test case, print a single line containing whichever message described in the Problem Statement above is appropriate. After all messages have been printed, the locked stub code in your editor prints the server load.

__Sample Output__
```
Exception: A is negative
Not enough memory
2
```

__Explanation__
__-8__ is negative, hence 'Exception: A is negative' is thrown. Since the second input is too large, 'not enough memory' is displayed. __2__ is the server load.