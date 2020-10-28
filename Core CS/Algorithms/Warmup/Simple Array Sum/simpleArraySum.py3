#!/bin/python3

import sys

def simpleArraySum(n, ar):
    # Complete this function
    return sum(ar)

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
result = simpleArraySum(n, ar)
print(result)
