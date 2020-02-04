# Maps-STL

Maps are a part of the C++ STL.Maps are associative containers that store elements formed by a combination of a key value and a mapped value, following a specific order.The mainly used member functions of maps are:
+ Map Template:
```c++
std::map <key_type, data_type>
```
+ Declaration:
```c++
map<string,int>m; //Creates a map m where key_type is of type string and data_type is of type int.
```
+ Size:
```c++
int length=m.size(); //Gives the size of the map.
```
+ Insert:
```c++
m.insert(make_pair("hello",9)); //Here the pair is inserted into the map where the key is "hello" and the value associated with it is9.
```

+ Erasing an element:
```c++
m.erase(val); //Erases the pair from the map where the key_type is val.
```
+ Finding an element:
```c++
map<string,int>::iterator itr=m.find(val); //Gives the iterator to the element val if it is found otherwise returns m.end()
```
```c++ 
map<string,int>::iterator itr=m.find("Maps"); //If Maps is not present as the key value then itr==m.end().
```
+ Accessing the value stored in the key:
```
To get the value stored of the key "MAPS" we can do m["MAPS"] or we can get the iterator using the find function and then by itr->second we can access the value.
```
To know more about maps click Here.

You are appointed as the assistant to a teacher in a school and she is correcting the answer sheets of the
students.Each student can have multiple answer sheets.So the teacher has __*Q*__ queries:

> __1 *X Y*__ :Add the marks __*Y*__ to the student whose name is __*X*__.   
__2 *X*__ : Erase the marks of the students whose name is __*X*__.  
__3 *X*__ : Print the marks of the students whose name is __*X*__. (If __*X*__ didn't get any marks print __0__ .)

**Input Format**


The first line of the input contains __*Q*__ where __*Q*__ is the number of queries. The next __*Q*__ lines contain __1__ query each.The first integer, __*type*__ of each query is the type of the query. If query is of type __1__, it consists of one string and an integer __*X*__ and __*Y*__ where __*X*__ is the name of the student and __*Y*__ is the marks of the student. If query is of type __2__ or __3__,it consists of a single string __*X*__ where __*X*__ is the name of the student.

**Constraints**

> __1 &le; *Q* &le; 100000__  
__1 &le; *type* &le; 3__  
__1 &le; |*X*| &le; 6__  
__1 &le; *Y* &le; 1000__  



**Output Format**

For queries of type __3__ print the marks of the given student.

**Sample Input**
```
7
1 Jesse 
1 Jess 121 Jess 
3 Jess3 Jesse
2 Jess3 Jess
```
**Sample Output**
```
30
20
0
```


