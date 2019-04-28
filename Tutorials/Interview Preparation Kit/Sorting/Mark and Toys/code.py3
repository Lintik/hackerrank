#!/bin/python3

import os

# Complete the maximumToys function below.
def maximumToys(prices, k):
    prices = sorted(prices)
    count = 0
    for i in range(len(prices)):
        if k - prices[i] > 0:
            count += 1
        k -= prices[i]
        if k <= 0:
            break
    return count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    prices = list(map(int, input().rstrip().split()))

    result = maximumToys(prices, k)

    fptr.write(str(result) + '\n')

    fptr.close()
