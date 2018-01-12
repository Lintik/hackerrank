#!/bin/python3

import sys

n = int(input().strip())
t = n
while(n > 1):
    t *= n - 1
    n -= 1
    
print(t)
