#!/bin/python3

import sys
import math

def sockMerchant(n, ar):
    # Complete this function
    ar.sort()
    t=0
    c=1
    prev = ar[0]
    for i in range(1,n):
        if(prev == ar[i]): c+=1
        else:
            t+=math.floor(c/2)
            c=1
            prev=ar[i]
            
    t+=math.floor(c/2);
    return t;

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
result = sockMerchant(n, ar)
print(result)
