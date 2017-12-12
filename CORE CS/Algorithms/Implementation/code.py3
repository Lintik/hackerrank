#!/bin/python3

import sys

n,k = input().strip().split(' ')
n,k = [int(n),int(k)]
height = list(map(int, input().strip().split(' ')))
r = max(height) - k
print(r) if r > 0 else print(0)
