# Sets-STL

Sets are a part of the C++ STL. Sets are containers that store unique elements following a specific order.
Here are some of the frequently used member functions of sets:

+ Declaration:

```c++
set<int>s; //Creates a set of integers.
```

+ Size:

```c++
int length=s.size(); //Gives the size of the set.
```

+ Insert:

```c++
s.insert(x); //Inserts an integer x into the set s.
```

+ Erasing an element:
```c++
s.erase(val); //Erases an integer val from the set s.
```

+ Finding an element:

```c++
set<int>::iterator itr=s.find(val); //Gives the iterator to the element val if it is found otherwise returns s.end().
Ex: set<int>::iterator itr=s.find(100); //If 100 is not present then it==s.end().
```

To know more about sets click Here. Coming to the problem, you will be given __*Q*__ queries. Each query
is of one of the following three types:

1. __*x*__: Add an element __*x*__ to the set.
2. __*x*__: Delete an element __*x*__ from the set. (If the number __*x*__ is not present in the set, then do nothing).
3. __*x*__: If the number __*x*__ is present in the set, then print "Yes"(without quotes) else print "No"(without
quotes).

**Input Format**

The first line of the input contains __*Q*__ where __*Q*__ is the number of queries. The next lines contain __1__ query each. Each query consists of two integers __*y*__ and __*x*__ where __*y*__ is the type of the query and __*x*__ is an integer.

**Constraints**
> __1 &le; *Q* &le; 100000__  
__1 &le; *y* &le; 3__  
__1 &le; *x* &le; 10<sup>9</sup>__

**Output Format**

For queries of type __3__ print "Yes"(without quotes) if the number is present in the set and if the number is not present, then print "No"(without quotes).
Each query of type __3__ should be printed in a new line.

**Sample Input**

```
8
1 9
1 6
1 10
1 4
3 6
3 14
2 6
3 6
```
**Sample Output**

```
Yes
No
No
```

