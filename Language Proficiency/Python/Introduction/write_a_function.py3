#!/bin/python3

def is_leap(year):
    leap = True if year % 4 == 0 and (year % 100 != 0 or year % 400 == 0) else False
    return leap

year = int(input())