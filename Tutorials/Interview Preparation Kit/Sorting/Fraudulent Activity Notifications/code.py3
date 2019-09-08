#!/bin/python3

import os

def median(count, d):
    d2 = int((d+1)//2)
    for i in range(201):
        if count[i] > d2: 
            return float(i)
        if count == d2:
            if d%2 != 0: 
                return float(i)
            for j in range(i+1,201):
                if count[j] > 0: 
                    return float((i+j)/2)
        d2 -= count[i]
    return float(0)

def activityNotifications(expenditure,n,d):
    result = 0
    count = [0]*201
    for i in range(n):
        v = expenditure[i]
        if i >= d:
            m = median(count,d)
            if v >= 2*m: 
                result += 1
            count[expenditure[i - d]] -= 1
        count[v] += 1
    return result


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    nd = input().split()
    n = int(nd[0])
    d = int(nd[1])

    expenditure = list(map(int, input().rstrip().split()))

    result = activityNotifications(expenditure,n,d)
    fptr.write(str(result) + '\n')
    fptr.close()
