#!/bin/python3

import sys

def solve(n, s, d, m):
    # Complete this function
    t = c = 0
    for i in range(m): t+=s[i];
    if(t==d): c+=1
        
    for i in range(m,n):
        t = t - s[i-m] + s[i]
        if(t==d): c+=1
       
    return c

n = int(input().strip())
s = list(map(int, input().strip().split(' ')))
d, m = input().strip().split(' ')
d, m = [int(d), int(m)]
result = solve(n, s, d, m)
print(result)
