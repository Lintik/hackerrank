#!/bin/python3

import sys

def gradingStudents(grades):
    g = []
    for i in grades:
        if i >= 38 and i%5 > 2:
            g.append(i - i%5 + 5)
        else:
            g.append(i)
    return g

n = int(input().strip())
grades = []
grades_i = 0
for grades_i in range(n):
   grades_t = int(input().strip())
   grades.append(grades_t)
result = gradingStudents(grades)
print ("\n".join(map(str, result)))
