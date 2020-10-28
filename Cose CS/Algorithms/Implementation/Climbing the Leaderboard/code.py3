#!/bin/python3

import sys
def findRank(scores, a):
    scores = list(set(scores))
    scores.sort(reverse=True)
    j = len(scores) - 1
    for i in range(len(a)):
        while(j>=0):
            if a[i] < scores[j]:
                a[i] = j + 2
                break
            elif a[i] == scores[j]:
                a[i] = j + 1
                break
                
            elif a[i] >= scores[0]:
                a[i] = 1
                break

            j-=1
    return a
    

if __name__ == "__main__":
    n = int(input().strip())
    scores = list(map(int, input().strip().split(' ')))
    m = int(input().strip())
    alice = list(map(int, input().strip().split(' ')))
    r = findRank(scores, alice)
    for i in r:
        print(i)
