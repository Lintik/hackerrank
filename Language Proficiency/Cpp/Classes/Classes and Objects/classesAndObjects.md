# Classes and Objects

A class defines a blueprint for an object. We use the same syntax to declare objects of a class as we use to declare variables of other basic types. For example:

```c++
    Box box1;          // Declares variable box1 of type Box
    Box box2;          // Declare variable box2 of type Box
```

Kristen is a contender for valedictorian of her high school. She wants to know how many students (if any) have scored higher than her in the

exams given during this semester.

Create a class named __*Student*__ with the following specifications:

* An instance variable named __*scores*__ to hold a student's __5__ exam scores.
* A void input() function that reads __5__ integers and saves them to __*scores*__.
* An int calculateTotalScore() function that returns the sum of the student's scores.

__Input Format__

Most of the input is handled for you by the locked code in the editor.

In the void Student::input() function, you must read __5__
scores from stdin and save them to your __*scores*__ instance variable.

__Constraints__

> 1 &le; n 100
0 &ge; examscore &le; 50

Output Format

In the int Student::calculateTotalScore() function, you must return the student's total grade (the sum of the values in __*scorse*__).

The locked code in the editor will determine how many scores are larger than Kristen's and print that number to the console.

__Sample Input__

The first line contains __*n*__, the number of students in Kristen's class. __*n*__ The subsequent lines contain each student's __5__ exam grades for this semester.

```
3
30 40 45 10 10
40 40 40 10 10
50 20 30 10 10
```

__Sample Output__
```
1
```

__Explanation__

Kristen's grades are on the first line of grades. Only __1__
student scored higher than her.