In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

__Function Description__

Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.  

aVeryBigSum has the following parameter(s):  
- int ar[n]: an array of integers.

__Return__  
- long: the sum of all array elements

__Input Format__

The first line of the input consists of an integer __*n*__.  
The next line contains __*n*__ space-separated integers contained in the array.

__Output Format__

Return the integer sum of the elements in the array.

__Constraints__
* *1 &#8806; n &#8806; 10*
* *0 &#8806; ar[i] &#8806; 10<sup>10</sup>*
 

__Sample Input__
```
5
1000000001 1000000002 1000000003 1000000004 1000000005
```
__Output__
```
5000000015
```

__Note:__
The range of the 32-bit integer is __(-2<sup>31</sup>) *to* (2<sup>31</sup> - 1) *or* [2147483648,2147483647]__.  
When we add several integer values, the resulting sum might exceed the above range. You might need to use long int C/C++/Java to store such sums. 