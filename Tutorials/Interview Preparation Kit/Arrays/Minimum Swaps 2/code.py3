#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the minimumSwaps function below.
def minimumSwaps(arr):
    c = 0
    index = [None] * len(arr)

    for i in range(len(arr)):#create a dictionary that returns the index
        index[arr[i] - 1] = i

    for i in range(len(arr) - 1):
        if arr[i] != i + 1:
            c += 1

            #swap arr
            t_arr = arr[i]
            arr[i] = i + 1
            arr[index[i]] = t_arr

            #swap index
            t = index[i]
            index[i] = i
            index[t_arr - 1] = t

    return c
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    res = minimumSwaps(arr)

    fptr.write(str(res) + '\n')

    fptr.close()
