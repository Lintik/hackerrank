### __Time Conversion__

Given a time in `12`-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.  
\- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.  

__Example__

+ __s = '12:01:00PM'__

    Return '12:01:00'

+ __s = '12:01:00AM'__

    Return '00:01:00'

__Function Description__

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):
+ string s: a time in `12` hour format 

__Returns__
+ string s: a time in `24` hour format 

__Input Format__

A single string `s` that represents a time in -hour clock format (i.e.: `hh:mm:ssAM` or `hh:mm:ssPM`)

__Constraints__

+ All input times are valid

__Sample Input 0__
```
07:05:45PM
```

__Sample Output 0__
```
19:05:45
```