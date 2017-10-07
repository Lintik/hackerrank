#!/bin/python3

import sys

arr = list(map(int, input().strip().split(' ')))

sorted(arr)
print(sum(arr[:-1:]), end=' ')
print(sum(arr[1::]))
