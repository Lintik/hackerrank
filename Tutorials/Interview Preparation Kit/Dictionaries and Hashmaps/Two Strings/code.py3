#!/bin/python3

import os

# Complete the twoStrings function below.
def twoStrings(s1, s2):
    s = set(s1)
    for letter in s2:
        if letter in s:
            return "YES"
            
    return "NO"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s1 = input()
        s2 = input()

        result = twoStrings(s1, s2)

        fptr.write(result + '\n')

    fptr.close()
