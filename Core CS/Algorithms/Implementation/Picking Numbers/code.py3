#!/bin/python3

import sys

def minAbsoluteDifference(a): 
    a.sort()
    if len(a) == 1: return 1
    
    m = 0
    c1 = 1
    c2 = 0
    prev = a[0]
    for i in range(1, len(a)):
        if a[i] == prev:
            c1+=1
        elif a[i] == prev + 1:
            c2+=1
        else:
            if m < c1 + c2:
                m = c1 + c2
            if a[i] - 1 == prev + 1:
                c1 = c2
                c2 = 1
                prev = a[i] - 1
            else:
                prev = a[i]
                c1 = 1
                c2 = 0
    if m < c1 + c2:
        m = c1 + c2
    return m

n = int(input().strip())
a = [int(a_temp) for a_temp in input().strip().split(' ')]
print(minAbsoluteDifference(a))
