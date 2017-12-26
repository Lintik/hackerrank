#!/bin/python3

import sys

n,k = input().strip().split(' ')
n,k = [int(n),int(k)]
c = [int(c_temp) for c_temp in input().strip().split(' ')]
E, p, i = [100, 0, 0]

while(E >= 0):
    E-=1
    p += k % n
    p %= n
    if c[p] == 1: E -= 2;
    if(p == 0):
        print(E)
        break
