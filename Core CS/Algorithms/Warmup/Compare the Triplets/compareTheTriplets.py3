size = int(input())
matrix = []

for _ in range(size):
    row = input().strip().split(' ')
    matrix.append(row)

d1, d2 = 0, 0

for i in range(size):
    d1 += int(matrix[i][i])
    d2 += int(matrix[-i-1][i])

print(abs(d1 - d2))
