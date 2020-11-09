import sys
import os

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def gcdArray(a):
    ans = a[0]
    
    for i in range(1,len(a)):
        ans = gcd(ans, a[i])
    return ans

def lcm(a, b):
    return a * int(b / gcd(a, b))

def lcmArray(a):
    ans = a[0]

    for i in range(1,len(a)): 
        ans = int(((a[i] * ans)) / (gcd(a[i], ans)))

    return ans


def getTotalX(a, b):
    l = lcmArray(a)
    g = gcdArray(b)

    count = 0
    i = l
    j = 2
    while i <= g:
        if g%i == 0:
            count += 1
            
        i = l * j
        j += 1
        
    return count
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    m = int(first_multiple_input[1])

    arr = list(map(int, input().rstrip().split()))

    brr = list(map(int, input().rstrip().split()))

    total = getTotalX(arr, brr)

    fptr.write(str(total) + '\n')

    fptr.close()
