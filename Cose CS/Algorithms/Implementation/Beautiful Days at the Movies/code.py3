a = [int(a_temp) for a_temp in input().strip().split(' ')]
c = 0
for k in range(a[0], a[1] + 1):
    r = 0
    temp = k
    while(temp > 0):
        r *= 10
        r += temp % 10
        temp //= 10
    if(abs(k - r) % a[2] == 0): c+=1
print(c)
