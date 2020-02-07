# C++ Variadics

A template parameter pack is a template parameter that accepts zero or more template arguments (non-types, types, or templates). To read more about parameter pack, click here.

Create a template function named reversed_binary_value. It must take an arbitrary number of bool values as template parameters. These booleans represent binary digits in reverse order. Your function must return an integer corresponding to the binary value of the digits represented by the booleans. For example: `reversed_binary_value<0,0,1>()` should return __4__.

__Input Format__

The first line contains an integer, __*t*__, the number of test cases. Each of the __*t*__ subsequent lines contains a test case. A test case is described as __2__ space-separated integers, __*x*__ and __*y*__, respectively.

+ __*x*__ is the value to compare against.
+ __*y*__ represents the range to compare: __64 &times; *y*__ to __64 &times; *y* &plus; 63__

__Constraints__
+ __0 &le; *x* &le; 65535__
+ __0 &le; *y* &le; 1023__
+ The number of template parameters passed to reversed_binary_value will be __&le; 16__

__Output Format__

Each line of output contains __64__ binary characters (i.e., __0__'s and __1__'s). Each character represents one value in the range. The first character corresponds to the first value in the range. The last character corresponds to the last value in the range. The character is __1__ if the value in the range matches ; otherwise, the character is __0__.

__Sample Input__
```
2
65 1
10 0
```
__Sample Output__
```
0100000000000000000000000000000000000000000000000000000000000000
0000000000100000000000000000000000000000000000000000000000000000
```
__Explanation__

The second character on the first line is a __1__, because the second value in the range __64..127__ is __65__ and __*x*__ is __65__.

The eleventh character on the second line is a __1__, because the eleventh value in the range __0..63__ is __10__ and __*x*__ is 10.

All other characters are zero, because the corresponding values in the range do not match __*x*__.