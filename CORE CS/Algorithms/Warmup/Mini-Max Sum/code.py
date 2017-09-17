# Enter your code here. Read input from STDIN. Print output to STDOUT
a = sorted(map(int,raw_input().split()))
print sum(a[:4]),sum(a[1:])
