import sys

def bonAppetit(k, b, ar):
    s = sum(ar) - ar[k]

    if(b-s/2 == 0): 
        print("Bon Appetit")
    else: 
        print(int(b - s/2))

n, k = input().strip().split(' ')
n, k = [int(n), int(k)]
ar = list(map(int, input().strip().split(' ')))
b = int(input().strip())
bonAppetit(k, b, ar)
