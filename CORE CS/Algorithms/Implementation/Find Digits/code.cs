#!/bin/python3

import sys

t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    r = n
    count = 0
    while(r > 0):
        if(r % 10 != 0 and n % (r % 10) == 0): count+=1
        r = r // 10
    print(count)
