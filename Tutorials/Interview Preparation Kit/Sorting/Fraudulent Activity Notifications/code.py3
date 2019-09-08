#!/bin/python3

import os

def median(count, d):
    d2 = (d+1)//2
    for i in range(len(count)):
        if count[i] > d2: 
            return 2 * i
        if count[i] == d2:
            if d%2 != 0: 
                return 2 * i
            for j in range(i+1,len(count)):
                if count[j] > 0: 
                    return i + j
        d2 -= count[i]
    return 0

def activityNotifications(a,n,d):
    result = 0
    count = [0]*201
    for i in range(n):
        v = a[i]
        if i >= d:
            m = median(count,d)
            if v >= m: 
                result += 1
            count[a[i - d]] -= 1
        count[v] += 1
    return result


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    nd = input().split()
    n = int(nd[0])
    d = int(nd[1])

    a = list(map(int, input().rstrip().split()))

    result = activityNotifications(a,n,d)
    fptr.write(str(result))
    fptr.close()
