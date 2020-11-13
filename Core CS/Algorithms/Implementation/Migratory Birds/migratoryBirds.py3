import os
import sys

def migratoryBirds(ar):
    r = [0] * 5
    
    for a in ar:
        r[a-1] += 1
            
    mx = 0;
    mx_i = 0;
    for  i in range(0,5):
        if r[i] > mx:
            mx = r[i]
            mx_i = i
        
    return mx_i + 1

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    result = migratoryBirds(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
