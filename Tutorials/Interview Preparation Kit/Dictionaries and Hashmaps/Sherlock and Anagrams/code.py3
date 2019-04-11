#!/bin/python3

import os
from collections import defaultdict

# Complete the sherlockAndAnagrams function below.
def sherlockAndAnagrams(s):
    subs = defaultdict(int)
    count = 0
    l = len(s)
    for i in range(l - 1, 0, -1):
        for j in range(0, l, 1):
            if i + j > l:
                break
            t = s[j:i+j]
            t = str(sorted(t))
            if t not in subs:
                subs[t] = 1
            else:
                subs[t] += 1

    for k, value in subs.items():
        if value > 1:
            count += int((value - 1) * value / 2)

    return count



if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s = input()

        result = sherlockAndAnagrams(s)

        fptr.write(str(result) + '\n')

    fptr.close()
