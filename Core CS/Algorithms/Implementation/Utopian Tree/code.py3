#!/bin/python3

import sys

t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    m = ~(~1<<(n>>1)) << n%2;
    print(m)
