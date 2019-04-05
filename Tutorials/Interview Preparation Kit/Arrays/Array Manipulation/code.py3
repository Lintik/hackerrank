#!/bin/python3

import os

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()
    n = int(nm[0])
    m = int(nm[1])
    a = [0] * (n + 1)

    for i in range(0, m):
        pqs = input().split()
        p = int(pqs[0])
        q = int(pqs[1])
        s = int(pqs[2])
        a[p] += s
        if q + 1 <= n:
            a[q+1] -= s
    
    x = 0
    ma = 0
    for i in range(1,n + 1):
        x = x + a[i]
        ma = max(ma, x)

    fptr.write(str(ma) + '\n')

    fptr.close()
