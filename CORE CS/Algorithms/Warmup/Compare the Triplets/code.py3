#!/bin/python3

import sys

def solve(a0, a1, a2, b0, b1, b2):
    # Complete this function
    r=[0 for x in range(2)]
    if(a0 > b0): r[0] += 1
    elif(a0 < b0): r[1] += 1
    if(a1 > b1): r[0] += 1
    elif(a1 < b1): r[1] += 1
    if(a2 > b2): r[0] += 1
    elif(a2 < b2): r[1] += 1
    return r

a0, a1, a2 = input().strip().split(' ')
a0, a1, a2 = [int(a0), int(a1), int(a2)]
b0, b1, b2 = input().strip().split(' ')
b0, b1, b2 = [int(b0), int(b1), int(b2)]
result = solve(a0, a1, a2, b0, b1, b2)
print (" ".join(map(str, result)))
