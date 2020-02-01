# Inherited Code

You inherited a piece of code that performs username validation for your company's website. The existing function works reasonably well, but it throws an exception when the username is too short. Upon review, you realize that nobody ever defined the exception.

The inherited code is provided for you in the locked section of your editor. Complete the code so that, when an exception is thrown, it prints `Too short: N` (where __*N*__ is the length of the given username).

**Input Format**

The first line contains an integer, __*T*__ , the number of test cases. 
Each of the  __*T*__ subsequent lines describes a test case as a single username string, __*U*__.

**Constraints**
* __1 &le; *T* &le; 1000__
* __1 &le; *U* &le; 100__
* The username consists only of uppercase and lowercase letters.

**Output Format**

You are not responsible for directly printing anything to stdout. If your code is correct, the locked stub code in your editor will print either `Valid` (if the username is valid), `Invalid` (if the username is invalid), or `Too short: N` (where __*N*__ is the length of the too-short username) on a new line for each test case.

**Sample Input**

```
3
Peter
Me
Arxwwz
```
**Sample Output**

```
Valid
Too short: 
Invalid
```
**Explanation**

Username `Me` is too short because it only contains __2__ characters, so your exception prints __Too short: 2__. All other validation is handled by the locked code in your editor.


