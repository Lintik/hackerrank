#!/bin/python3

import sys

def migratoryBirds(n, ar):
    # Complete this function
    sorted(ar)
    prev = freq = ar[0]
    c = mc = 0
    for i in range(1,len(ar)):
        if(ar[i] == prev): c+=1
        else:
            if(c > mc):
                freq = ar[i-1]
                mc = c
            prev = ar[i]
            c = 1
            
    return ar[-1] if c > mc else freq

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
result = migratoryBirds(n, ar)
print(result)
