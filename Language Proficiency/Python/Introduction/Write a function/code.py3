def is_leap(year):
    leap = True if year % 4 == 0 else False
    return leap

year = int(input())