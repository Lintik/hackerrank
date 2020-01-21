#!/usr/bin/python

def displayPathtoPrincess(n,grid):
    for i in range(0, n):
        for j in range(0, n):
            if(grid[i][j] == "m"):
                ym = i
                xm = j
            if(grid[i][j] == 'p'):
                yp = i
                xp = j
    x = xp-xm
    y = yp-ym
    while(x != 0):
        if(x > 0):
            print("RIGHT")
            if(y > 0):
                print("DOWN")
                y = abs(y) - 1
            elif(y == 0):
                pass
            else:
                print("UP")
                y += 1
            x -= 1
        else:
            print("LEFT")
            if(y > 0):
                print("DOWN")
                y = abs(y) - 1
            elif(y == 0):
                pass
            else:
                print("UP")
                y += 1
            x += 1
    return
        

m = int(input())
grid = [] 
for i in range(0, m): 
    grid.append(input().strip())

displayPathtoPrincess(m,grid)