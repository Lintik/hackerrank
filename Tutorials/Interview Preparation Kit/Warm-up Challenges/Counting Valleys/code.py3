import sys

def solve(n, ar):
    depth = t = 0
    for i in ar:
        if i == 'U':
            depth += 1
            if depth == 0: 
                t += 1
        else:
            depth -= 1
    return t

n =int(input())
ar =input()

result = solve(n,ar)
print(result)