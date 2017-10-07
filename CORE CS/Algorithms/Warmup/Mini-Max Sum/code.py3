a = input().strip().split(' ')
for i in range(0, len(a)):
    a[i] = int(a[i])
    
s = sum(a)
print(str(s - max(a)) + " " + str(s - min(a)))
