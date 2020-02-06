# C++ Class Template Specialization

You are given a main function which reads the enumeration values for two different types as input, then prints out the corresponding enumeration names. Write a class template that can provide the names of the enumeration values for both types. If the enumeration value is not valid, then print unknown.

__Input Format__

The first line contains __*t*__, the number of test cases.
Each of the __*t*__ subsequent lines contains two space-separated integers. The first integer is a color value, __*c*__, and the second integer is a fruit value, __*f*__.

__Contrainsts__
+ __1 &le; *t* &le; 100__
+ __-2 &times; 10<sup>9</sup> &le; *c* &le; 2 &times; 10<sup>9</sup>__
+ __-2 &times; 10<sup>9</sup> &le; *f* &le; 2 &times; 10<sup>9</sup>__

__Output Format__

The locked stub code in your editor prints __*t*__ lines containing the color name and the fruit name corresponding to the input enumeration index.

__Sample Input__
```
2
1 0
3 3
```
__Sample Output__
```
green apple
unknown unknown
```
__Explanation__

Since __*t = 2*__, there are two lines of output.

1. The two input index values, __1__ and __0__, correspond to green in the color enumeration and apple in the fruit enumeration. Thus, we print green apple.
2. The two input values, __3__ and __3__, are outside of the range of our enums. Thus, we print unknown unknown.