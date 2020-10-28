#!/bin/python3

import sys

def solve(n, p):
    # Complete this function
    return min(p//2,n//2-p//2)

n = int(input().strip())
p = int(input().strip())
result = solve(n, p)
print(result)
