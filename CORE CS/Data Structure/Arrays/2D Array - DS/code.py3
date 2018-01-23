#!/bin/python3
import sys

arr = []
for arr_i in range(6):
    arr_t = [int(arr_temp) for arr_temp in input().strip().split(' ')]
    arr.append(arr_t)
n = [None]*16
k = 0
for i in range(4):
    for j in range(4):
        n[k] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
        n[k] += arr[i+1][j+1]
        n[k] += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]
        k+=1

m = max(n)
print(m)
