m = [2]
for i in range(int(input())-1):
    m.append(int(3*m[i]/2))
print(sum(m))
