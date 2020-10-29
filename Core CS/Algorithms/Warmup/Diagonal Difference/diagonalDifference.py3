size = input()
matrix = []

for _ in range(size):
    row = map(int, raw_input().split())
    matrix.append(row)

d1, d2 = 0, 0

for i in range(size):
    d1 += matrix[i][i]
    d2 += matrix[-i-1][i]

print(abs(d1 - d2))
