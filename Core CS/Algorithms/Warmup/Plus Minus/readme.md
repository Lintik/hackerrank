### __Plus Minus__

Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with __6__ places after the decimal.

__Note__: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to __10<sup>-4</sup>__ are acceptable.

__Example__

#### ___arr_ = [1, 1, 0, -1, -1]__

There are ___n_ =5__ elements, two positive, two negative and one zero. Their ratios are __2/5 = 0.400000__, __2/5 = 0.400000__ and __1/5 = 0.200000__. Results are printed as:

```
0.400000
0.400000
0.200000
```
__Function Description__

Complete the plusMinus function in the editor below.

plusMinus has the following parameter(s):

- int arr[n]: an array of integers

__Print__  

Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with __6__ digits after the decimal. The function should not return a value.  

__Input Format__  

The first line contains an integer, ___n___, the size of the array.  
The second line contains ___n___ space-separated integers that describe ___arr_[_n_]__.

__Constraints__

### 0 &lt; _n_ &le;  100
### -100 &le; _arr_[_i_] &le; 100


__Output Format__

__Print__ the following __3__ lines, each to __6__ decimals:

1. proportion of positive values
2. proportion of negative values
3. proportion of zeros

__Sample Input__

```
6
-4 3 -9 0 4 1         
```

__Sample Output__
```
0.500000
0.333333
0.166667
```
__Explanation__

There are __3__ positive numbers, __2__ negative numbers, and __1__ zero in the array.  
The proportions of occurrence are positive: __3/6 = 0.500000__, negative: __2/6 = 0.333333__ and zeros: __1/6 = 0.166667__.
