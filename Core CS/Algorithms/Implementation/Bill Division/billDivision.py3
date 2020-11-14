#!/bin/python3

import sys

def bonAppetit(n, k, b, ar):
    s = 0
    t = ar[k]
    ar[k] = 0
    for i in range(0,n):
        s+=ar[i]
    if(b-s/2 == 0): 
        print("Bon Appetit")
        return 0
    else: return b - s/2

n, k = input().strip().split(' ')
n, k = [int(n), int(k)]
ar = list(map(int, input().strip().split(' ')))
b = int(input().strip())
result = bonAppetit(n, k, b, ar)
if(result>0):
    print(int(result))
