#!/bin/python3

import math
import os
import random
import re
import sys

count = 0

def merge(l1,l2):
    

def mergeSort(arr):
    if len(arr) == 1: 
        return arr
    l = len(arr) // 2
    l1 = arr[:l]
    l2 = arr[l:]
    return merge(l1,l2)

def countInversions(arr):
    a = mergeSort(arr)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())
        arr = list(map(int, input().rstrip().split()))
        count = 0
        countInversions(arr)
        fptr.write(str(count) + '\n')

    fptr.close()
