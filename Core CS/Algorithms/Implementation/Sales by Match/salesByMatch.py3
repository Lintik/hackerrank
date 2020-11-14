import sys
import math
from collections import Counter

def pair(x):
    return int(x/2) 

def sockMerchant(ar):
    return sum(map(pair, Counter(ar).values()))

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
result = sockMerchant(ar)
print(result)
