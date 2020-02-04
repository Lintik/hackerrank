# Attribute Parser

We have defined our own markup language HRML. In HRML, each element consists of a starting and ending tag, and there are attributes associated with each tag. Only starting tags can have attributes. We can call an attribute by referencing the tag, followed by a tilde, '~' and the name of the attribute. The tags may also be nested.

The opening tags follow the format: 

```html
<tag-name attribute1-name = "value1" attribute2-name = "value2" ...>
```

The closing tags follow the format:
```html
</tag-name>
```

For example:
```html
<tag1 value = "HelloWorld">
<tag2 name = "Name1">
</tag2>
</tag1>
```

The attributes are referenced as:

```html
tag1~value  
tag1.tag2~name
```

You are given the source code in HRML format consisting of __*N*__ lines. You have to answer __*Q*__ queries. Each query asks you to print the value of the attribute specified. Print "Not Found!" if there isn't any such attribute.

__Input Format__

The first line consists of two space separated integers, __*N*__ and __*Q*__. __*N*__ specifies the number of lines in the HRML source program. __*Q*__ specifies the number of queries.

The following __*N*__ lines consist of either an opening tag with zero or more attributes or a closing tag.There is a space after the tag-name, attribute-name, '=' and value.There is no space after the last value. If there are no attributes there is no space after tag name.

__*Q*__ queries follow. Each query consists of string that references an attribute in the source program.More formally, each query is of the form __*tag<sub>i<sub>1</sub></sub>.tag<sub>i<sub>2</sub></sub>.tag<sub>i<sub>3</sub></sub>....tag<sub>i<sub>n</sub></sub> ~attr - name*__ where __*m &ge; 1*__ and __*tag<sub>i<sub>1</sub></sub>.tag<sub>i<sub>2</sub></sub>.tag<sub>i<sub>3</sub></sub>....tag<sub>i<sub>n</sub></sub>*__

__Constraints__
+ __1 &le; *N* &le; 20__
+ __1 &le; *Q* &le; 20__
+ Each line in the source program contains, at max, __200__ characters.
+ Every reference to the attributes in the __*Q*__ queries contains at max __200__ characters.
+ All tag names are unique and the HRML source program is logically correct.
+ A tag can have no attributes as well.

__Output Format__

Print the value of the attribute for each query. Print "Not Found!" without quotes if there is no such attribute in the source program. 

__Sample Input__
```
4 3
<tag1 value = "HelloWorld">
<tag2 name = "Name1">
</tag2>
</tag1>
tag1.tag2~name
tag1~name
tag1~value
```

__Sample Output__
```
Name1
Not Found!
HelloWorld
```