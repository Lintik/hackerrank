#!/bin/python3

import os
from collections import defaultdict

# Complete the countTriplets function below.
def countTriplets(arr, r):
    potential = {}
    counter = {}
    count = 0
    for i in arr:
        key = i / r
        if key in counter and i % r == 0:
            count += counter[key]
        if key in potential and i % r == 0:
            c = potential[key]
            d = c if i not in counter else c + counter[i]
            counter[i] = d
        
        e = 1 if i not in potential else potential[i] + 1
        potential[i] = e
    
    return count
        
        
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nr = input().rstrip().split()

    n = int(nr[0])

    r = int(nr[1])

    arr = list(map(int, input().rstrip().split()))

    ans = countTriplets(arr, r)

    fptr.write(str(ans) + '\n')

    fptr.close()
