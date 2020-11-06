### __Between Two Sets__

You will be given two arrays of integers and asked to determine all integers that satisfy the following two conditions:

1. The elements of the first array are all factors of the integer being considered
2. The integer being considered is a factor of all elements of the second array

These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.

For example, given the arrays `a = [2. 6]` and `b = [24, 36]`, there are two numbers between them `6`: and `12`. `6%2 = 0`, `0.6%6 = 0`, `0.24%6 = 0`, and `36%6 = 0` for the first value. Similarly, `12%2 = 0`, `12%6 = 0` and `24%12 = 0`, `36%12 = 0`.

__Function Description__

Complete the getTotalX function in the editor below. It should return the number of integers that are betwen the sets.

getTotalX has the following parameter(s):

- a: an array of integers
- b: an array of integers

__Input Format__

The first line contains two space-separated integers,
and , the number of elements in array and the number of elements in array .
The second line contains distinct space-separated integers describing where .
The third line contains distinct space-separated integers describing where 