ar = list(map(int, input().strip().split(' ')))
print(str(sum(ar) - max(ar)) + " " + str(sum(ar) - min(ar)))