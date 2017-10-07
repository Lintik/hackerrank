#!/bin/python3

import sys


n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]
p = 0
q = 0
z = 0
for ele in arr:
    if (ele > 0): 
        p+=1
    elif (ele < 0): 
        q+=1
    else: 
        z+=1
print(p/n)
print(q/n)
print(z/n)
