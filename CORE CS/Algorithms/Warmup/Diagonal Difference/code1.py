size = input()
matrix = []

# reading input
for _ in xrange(size):
    row = map(int, raw_input().split())
    matrix.append(row)

# initialize s1 for right diagonal and s2 for left diagonal
s1, s2 = 0, 0

# summing up together in just 1 loop, -ve index
# (-x) in python is actually (size - x)
for i in xrange(size):
    s1 += matrix[i][i]
    s2 += matrix[-i-1][i]

# printing absolute difference
print abs(s1 - s2)
