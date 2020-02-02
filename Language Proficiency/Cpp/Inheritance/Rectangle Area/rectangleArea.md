# Rectangle Area

Create two classes:

**Rectangle**
The *Rectangle* class should have two data fields-width and height of int types. The class should have
*display()* method, to print the *width* and *height* of the rectangle separated by space.

**RectangleArea**
The *RectangleArea* class is derived from *Rectangle* class, i.e., it is the sub-class of *Rectangle* class. The class should have *read_input()* method, to read the values of *width* and *height* of the rectangle. The
*RectangleArea* class should also overload the *display()* method to print the area __(width &times; height)__ of the rectangle.

**Input Format**

The first and only line of input contains two space separated integers denoting the width and height of the
rectangle.

**Constraints**
* __1 &le; width, height &le; 100  

**Output Format**

The output should consist of exactly two lines:
In the first line, print the width and height of the rectangle separated by space.
In the second line, print the area of the rectangle.

**Sample Input**

```
10 5
```
**Sample Output**

```
10 5
50
```
**Explanation**

As, __width = 10__ and __height = 5__, so __area = width &times; height = 50__


