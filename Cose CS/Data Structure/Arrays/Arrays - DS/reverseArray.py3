import sys

N = input()
A = [int(x) for x in input().split()]

print(' '.join([str(x) for x in reversed(A)]))
