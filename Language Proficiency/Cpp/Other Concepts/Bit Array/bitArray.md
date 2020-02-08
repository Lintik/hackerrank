# Bit Array

You are given four integers: __*N*__, __*S*__, __*P*__, __*Q*__. . You will use them in order to create the sequence __*a*__  with the following pseudo-code.
```scala
a[0] = S (modulo 2^31)
for i = 1 to N-1
    a[i] = a[i-1]*P+Q (modulo 2^31) 
```

Your task is to calculate the number of distinct integers in the sequence __*a*__.

__Input Format__

Four space separated integers on a single line __*N*__, __*S*__, __*P*__ and __*Q*__ respectively.

__Output Format__

A single integer that denotes the number of distinct integers in the sequence __*a*__.

__Constraints__
> __1 &le; *N* &le; 10<sup>8</sup>__  
__1 &le; *S*,*P*,*Q* &le; 2<sup>31</sup>__



__Sample Input__
```
3 1 1 1
```
__Sample Output__
```
3
```
__Explanation__
```
a = [1,2,3]
```

Hence, there are different __3__ integers in the sequence.