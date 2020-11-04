### __Apple and Orange__

Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, determine the number of apples and oranges that land on Sam's house.

In the diagram below:

- The red region denotes the house, where _`s`_ is the start point, and _`t`_ is the endpoint. The apple tree is to the left of the house, and the orange tree is to its right.
- Assume the trees are located on a single point, where the apple tree is at point _`a`_, and the orange tree is at point _`b`_.
- When a fruit falls from its tree, it lands _`d`_ units of distance from its tree of origin along the _`x`_-axis. \*A negative value of _`d`_ means the fruit fell _`d`_ units to the tree's left, and a positive value of _`d`_ means it falls _`d`_ units to the tree's right. \*

![appple_orange](https://github.com/Lintik/hackerrank/blob/master/Core%20CS/Algorithms/Implementation/Apple%20and%20Orange/1474218925-f2a791d52c-Appleandorange2.png)

Given the value of _`d`_ for _`m`_ apples and _`n`_ oranges, determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range `[s, t]`)?  

For example, Sam's house is between `s = 7` and `t = 10`. The apple tree is located at `a = 4` and the orange at `b = 12`. There are `m = 3` apples and oranges. Apples are thrown `apples = [2, 3, -4]` units distance from `a`, and `oranges = [3, -2, -4]` units distance. Adding each apple distance to the position of the tree, they land at `[4 + 2, 4 + 3, 4 + -4]`. Oranges land at `[12 + 3, 12 + -2, 12 + -4] = [6, 7. 0]`. One apple and two oranges land in the inclusive range `7 - 10` so we print

```
1
2
```
__Function Description__

Complete the countApplesAndOranges function in the editor below. It should print the number of apples and oranges that land on Sam's house, each on a separate line.

countApplesAndOranges has the following parameter(s):

- s: integer, starting point of Sam's house location.
- t: integer, ending location of Sam's house location.
- a: integer, location of the Apple tree.
- b: integer, location of the Orange tree.
- apples: integer array, distances at which each apple falls from the tree.
- oranges: integer array, distances at which each orange falls from the tree.

__Input Format__

The first line contains two space-separated integers denoting the respective values of _`s`_ and _`t`_.  
The second line contains two space-separated integers denoting the respective values of _`a`_ and _`b`_.
The third line contains two space-separated integers denoting the respective values of _`m`_ and _`n`_.
The fourth line contains _`m`_ space-separated integers denoting the respective distances that each apple falls from point _`a`_.
The fifth line contains _`m`_ space-separated integers denoting the respective distances that each orange falls from point _`b`_.

__Constraints__

+ 1 &le; _s_, _t_, _a_, _b_, _m_, _n_ &le; 10<sup>5</sup>
+ -10<sup>5</sup> &le; _d_ &le; 10<sup>5</sup>
+ _a_ &lt; _s_ &lt; _t_ &lt; _b_

__Output Format__

Print two integers on two different lines:

1. The first integer: the number of apples that fall on Sam's house.
2. The second integer: the number of oranges that fall on Sam's house.

__Sample Input 0__

```
1
1
```