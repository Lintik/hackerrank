#!/bin/python3

import sys

def getRecord(s):
    # Complete this function
    maxc = minc = 0
    m = n = s[0]
    
    for i in range(1,len(s)):
        if m<s[i]:
            m=s[i]
            maxc+=1
        elif n>s[i]:
            n=s[i]
            minc+=1
    
    return [maxc,minc]

n = int(input().strip())
s = list(map(int, input().strip().split(' ')))
result = getRecord(s)
print (" ".join(map(str, result)))
