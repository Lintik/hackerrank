# For Loop

A *for* loop is a programming language statement which allows code to be repeatedly executed.

The syntax for this is

```scala
for ( <expression_1> ; <expression_2> ; <expression_3> ) 
    <statement>
```
* *expression_1* for the loop. is used for intializing variables which are generally used for controlling terminating flag
* *expression_2* is used to check for the terminating condition. If this evaluates to false, then the loop is
terminated.
* *expression_3* is generally used to update the flags/variables.

A sample loop will be

```c++
for(int i = 0; i < 10; i++) { 
    ...
}
```
**Input Format**

You will be given two positive integers __*a*__, __*b*__ and (__*a* &le; *b*__), separated by a newline.

**Output Format**

For each integer in the interval __|*a*,*b*|__:
* If __1 &le; *n* &le; 9__, then print the English representation of it in lowercase. That is "one" for __1__, "two" for __2__, and so on.
* Else if __*n* &gt; 9__ and it is an even numeber, then print "even".
* Else if __*n* &gt; 9__ and it is an odd number, then print "odd".

__Note: [*a*,*b*] = {*x* &isin; *Z*| *a* &le; *x* &le; *b*} = {*a*, *a* + 1. ..., *b*}__  

__Sample Input__

```
8
11
```
**Sample Output**
```
eight
nine
even
odd
```