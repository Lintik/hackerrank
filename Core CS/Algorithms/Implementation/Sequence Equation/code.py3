import sys
n =  int(input())
p = input().strip().split(' ')
p = list(map(int, p));
p_inverse = [None]*(n+1)
for i in range(1,n+1):
    p_inverse[p[i-1]] = i
for i in range(1,n+1):
    print(p_inverse[p_inverse[i]])
