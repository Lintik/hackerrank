#!/bin/python3

import sys

def getMoneySpent(keyboards, drives, s):
    keyboards.sort(reverse=True)
    drives.sort(reverse=True)
    
    m = 0
    for i in keyboards:
        for j in drives:
            t = i + j
            if t == s:
                return s
            elif t < s:
                if m < t: m = t
                break
    if m == 0: return -1
    else: return m

s,n,m = input().strip().split(' ')
s,n,m = [int(s),int(n),int(m)]
keyboards = list(map(int, input().strip().split(' ')))
drives = list(map(int, input().strip().split(' ')))

moneySpent = getMoneySpent(keyboards, drives, s)
print(moneySpent)
