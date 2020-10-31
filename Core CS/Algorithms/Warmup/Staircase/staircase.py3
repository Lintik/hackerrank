n = int(input())
for i in range(n):
    #repeat string by multiplication
    print(' '*(n-i-1), end="")
    print('#'*(i+1))
