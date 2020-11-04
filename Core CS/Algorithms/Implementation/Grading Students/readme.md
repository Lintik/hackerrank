### __Grading Students__

HackerLand University has the following grading policy:

- Every student receives a _`grade`_ in the inclusive range from `0` to `100`.
- Any _`grade`_ less than `40` is a failing grade.

Sam is a professor at the university and likes to round each student's _`grade`_ according to these rules:

- If the difference between the _`grade`_ and the next multiple of `5` is less than `3`, _`grade`_ round up to the next multiple of `5`.
- If the value of _`grade`_ is less than `38`, no rounding occurs as the result will still be a failing grade.  

__Examples__

- _`grade`_ `= 84` round to `85` (85 - 84 is less than 3)
- _`grade`_ `= 29` do not round (result is less than 40)
- _`grade`_ `= 57` do not round (60 - 57 is 3 or higher)

Given the initial value of _`grade`_ for each of Sam's _`n`_ students, write code to automate the rounding process.

__Function Description__

Complete the function gradingStudents in the editor below.

gradingStudents has the following parameter(s):

- int grades[n]: the grades before rounding

__Returns__

- int[n]: the grades after rounding as appropriate

__Input Format__

The first line contains a single integer, _`n`_, the number of students.
Each line _`1`_ of the _`n`_ subsequent lines contains a single integer, _`grades`_`[`_`i`_`]`.

__Constraints__

+ 1 &le; n &le; 60
+ 0 &le; grades[i] &le; 100

__Sample Input 0__

```
4
73
67
38
33
```
__Sample Output 0__
```
75
67
40
33
```