#!/bin/python3

import os
import sys

def timeConversion(s):
    if s[8] == "P":
        if s[0:2] == "12":
            return s[0:8]
        else:
            return str(int(s[0:2]) + 12) + s[2:8]
    else:
        if s[0:2] == "12":
            return "00" + s[2:8]
        else:
            return s[0:8]
    

if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')
    s = input()
    result = timeConversion(s)
    f.write(result + '\n')
    f.close()
