Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows: 

1. If the book is returned on or before the expected return date, no fine will be charged (i.e. __*fine = 0*__).
2. If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, __*fine* = 15 Hackos &#215; (the number of days late)__.
3. If the book is returned after the expected return month but still within the same calendar year as the expected return date, the __*fine* = 500 Hackos &#215; (the number of months late)__
4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of __10000 Hackos__

Charges are based only on the least precise measure of lateness. For example, whether a book is due January 1, 2017 or December 31, 2017, if it is returned January 1, 2018, that is a year late and the fine would be __10,000 Hackos__

__Function Description__  

Complete the libraryFine function in the editor below. It must return an integer representing the fine due.  
libraryFine has the following parameter(s):

* d1, m1, y1: returned date day, month and year 
* d2, m2, y2: due date day, month and year 

__Input Format__

The first line contains __3__ space-separated integers, __*d*1__, __*m*1__, __*y*2__, denoting the respective __*day*__, __*month*__, and __*year*__ on which the book was returned. 