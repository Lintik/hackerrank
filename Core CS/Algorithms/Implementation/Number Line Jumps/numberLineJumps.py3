#!/bin/python3

import sys

def numberLineJumps(x1, v1, x2, v2):
    if(v2 > v1): return "NO"
    while(x1<x2):
        x1+=v1
        x2+=v2
    
    if(x1==x2): return "YES"
    else: return "NO"
    

x1, v1, x2, v2 = input().strip().split(' ')
x1, v1, x2, v2 = [int(x1), int(v1), int(x2), int(v2)]
result = numberLineJumps(x1, v1, x2, v2)
print(result)
