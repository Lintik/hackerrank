#!/bin/python3

import os

def merge(l1,l2):
    global count
    c = [0] * (len(l2) + len(l1))
    i = j = k = 0
    while i < len(l1) and j < len(l2):
        if l1[i] > l2[j]:
            c[k] = l2[j]
            j += 1
            count += len(l1) - i
        else:
            c[k] = l1[i]
            i += 1
        k += 1
        
    while i < len(l1):
        c[k] = l1[i]
        k+=1
        i+=1
    
    while j < len(l2):
        c[k] = l2[j]
        k+=1
        j+=1

    return c


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
    global count
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())
        arr = list(map(int, input().rstrip().split()))
        count = 0
        countInversions(arr)
        fptr.write(str(count) + '\n')

    fptr.close()
