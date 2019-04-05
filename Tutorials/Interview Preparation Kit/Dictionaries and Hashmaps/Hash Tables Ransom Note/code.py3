#!/bin/python3

import os
from collections import defaultdict

# Complete the checkMagazine function below.
def checkMagazine(magazine, note):
    words = defaultdict(int)
    for word in magazine:
        if word not in words:
            words[word] = 1
        else:
            words[word] += 1
    
    for word in note:
        words[word] -= 1
        if words[word] < 0:
            print("No")
            return
    print("Yes")
    return


if __name__ == '__main__':
    mn = input().split()

    m = int(mn[0])

    n = int(mn[1])

    magazine = input().rstrip().split()

    note = input().rstrip().split()

    checkMagazine(magazine, note)
