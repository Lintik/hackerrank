# Pointer

A pointer in C is a way to share a memory address among different contexts (primarily functions). They are primarily used whenever a function needs to modify the content of a variable, of which it doesn't have ownership. 

In order to access the memory address of a variable, __*val*__, we need to prepend it with __&__ sign. E.g., `&val` returns the memory address of __*val*__. 

This memory address is assigned to a pointer and can be shared among various functions. E.g. __*int\*p = &val*__ will assign the memory address of __*val*__ to pointer __*p*__. To access the content of the memory to
which the pointer points, prepend it with a `*`. For example, `*p` will return the value reflected by __*val*__ and any modification to it will be reflected at the source (__*val*__).

```c++
void increment(int *v) {
    (*v)++;
}
int main() {
    int a;
    scanf("%d", &a);
    increment(&a);
    printf("%d", a);
    return 0;
}  
```
You have to complete the function void *update(int *a,int *b)*, which reads two integers as argument, and
sets __*a*__ with the sum of them, and __*b*__ with the absolute difference of them.  
* __*a*' = *a* + *b*__
* __*b* = |*a* - *b*|__

**Input Format**

Input will contain two integers, __*a*__ and __*b*__, separated by a newline.

**Output Format**

You have to print the updated value of __*a*__ and __*b*__, on two different lines.

*P.S.:* Input/ouput will be automatically handled. You only have to complete the *void update(int *a,int *b)* function.

**Sample Input**

```
4
5
```
**Sample Output**

```
9
1
```

**Explanation**

* *a*' = 4 + 5 = 9
* *b*' = |4 - 5| = 1


