#!/bin/python3

import sys

h = list(map(int, input().strip().split(' ')))
word = input().strip()
m = 0
for letter in word:
    if(h[ord(letter) - 97] > m):
        m = h[ord(letter) - 97]

print(len(word) * m)
