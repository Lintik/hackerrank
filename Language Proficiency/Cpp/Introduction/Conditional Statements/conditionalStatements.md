# Conditional Statements

*if* and *else* are two of the most frequently used conditionals in C/C++, and they enable you to execute
zero or one conditional statement among many such dependent conditional statements. We use them in
the following ways:


1. *if*: This executes the body of bracketed code starting with __*statement*1__ if __*condition*__ evaluates to
*true*.

```c++
if (condition) {
    statement1;
    ...
}
```
2. *if* - *else*: This executes the body of bracketed code starting with __*statement*1__ if __*condition*__ evaluates to *true*, or it executes the body of code starting with __*statement*2__ if __*condition*__ evaluates to *false*.
Note that only *one* of the bracketed code sections will ever be executed.

```c++
if (condition) {
    statement1;
    ...
}
else {
    statement2;
    ...
}
```

3. *if* - *else* *if* - *else*: In this structure, dependent statements are chained together and the __*condition*__ for each statement is only checked if all prior conditions in the chain evaluated to *false*. Once a __*condition*__ evaluates to *true*, the bracketed code associated with that statement is executed and the program then skips to the end of the chain of statements and continues executing. If each __*condition*__ in the chain evaluates to *false*, then the body of bracketed code in the else block at the end is
executed.

```c++
if(first condition) {
    ...
}
else if(second condition) {
    ...
}
.
.
.
else if((n-1) condition) {
    ....
}
else {
    ...
}
```

Given a positive integer denoting __*n*__, do the following:

* If __1 &le; *n* &le; 9__, then print the lowercase English word corresponding to the number (e.g., `one` for __1__, `two` for __2__, etc.).
* If __n &gt; 9__, print `Greater than 9`.  

**Input Format**


A single integer denoting __*n*__.

**Constraints**  
* __1 &le; *n* &le; 10<sup>9</sup>__

**Output Format**

If __1 &le; *n* &le; 9__, then print the lowercase English word corresponding to the number (e.g., `one` for __1__, `two` for __2__, etc.); otherwise, print `Greater than 9` instead.

**Sample Input 0**

```
5
```
**Sample Output 0**

```
five
```
**Explanation 0**

`five` is the English word for the number __5__.

**Sample Input 1**

```
8
```
**Sample Output 1**

```
eight
```
**Explanation 1**

* `eight` is the English word for the number __8__.

**Sample Input 2**

```
44
```
**Sample Output 2**

```
Greater than 9
```
**Explanation 2**

__*n* = 44__ is greater than __9__, so we print `Greater than 9`.


