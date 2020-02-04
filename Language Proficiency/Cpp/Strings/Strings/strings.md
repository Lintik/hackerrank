# Strings

C++ provides a nice alternative data type to manipulate strings, and the data type is conveniently called
string. Some of its widely used features are the following:

+ Declaration:
```c++
string a = "abc";
```

+ Size:

```c++
int len = a.size();
```

+ Concatenate two strings:

```c++
string a = "abc";
string b = "def";
string c = a + b; // c = "abcdef".
```

+ Accessing element:

```c++
string s = "abc";
char c0 = s[0]; // c0 = 'a'
char c1 = s[1]; // c1 = 'b'
char c2 = s[2]; // c2 = 'c'

s[0] = 'z'; // s = "zbc"
```
P.S.: We will use cin/cout to read/write a string.

**Input Format**

You are given two strings, __*a*__ and __*b*__, separated by a new line. Each string will consist of lower case Latin
characters ('a'-'z').

**Output Format**

In the first line print two space-separated integers, representing the length of __*a*__ and __*b*__ respectively.  
In the second line print the string produced by concatenating __*a*__ and __*b (a &plus; b)*__.  
In the third line print two strings separated by a space, __*a'*__ and __*b'*__. __*a'*__ and __*b'*__ are the same as __*a*__ and __*b*__ respectively, except that their first characters are swapped.

**Sample Input**

```
abcd
ef
```
**Sample Output**

```
4 2
abcdef
ebcd af
```
**Explanation**

+ __*a*__ = "abcd"
+ __*b*__ = "ef"
+ __*|a|* = 4__
+ __*|b|* = 2__
+ __*a &plus; b*__ = "abcdef"
+ __*a' =*__ "ebcd"
+ __*b' =*__ "af"

