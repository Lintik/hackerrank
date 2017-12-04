#!/bin/python3

import sys


q = int(input().strip())
for a0 in range(q):
    x,y,z = input().strip().split(' ')
    x,y,z = [int(x),int(y),int(z)]
    
    xy = abs(x - z)
    yz = abs(y - z)
    if xy > yz: print("Cat B")
    elif xy < yz: print("Cat A")
    else: print("Mouse C")
