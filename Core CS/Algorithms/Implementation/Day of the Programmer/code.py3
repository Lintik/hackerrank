#!/bin/python3

import sys

def solve(year):
    # Complete this function
    mon7 = 215
    feb = 0#days in february
    if(year < 1918): #julian
        feb = 28 if year%4>0 else 29
    elif(year > 1918): #gregorian
        feb = 29 if (not (year%400 >0)) or year%100>0 and (not(year%4>0)) else 28
    else: #1918
        feb = 15
    feb = 256 - (feb + mon7)
    return str(feb) + ".09." + str(year)

year = int(input().strip())
result = solve(year)
print(result)
