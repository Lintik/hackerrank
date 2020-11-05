### __Number Line Jumps__

You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity). 

- The first kangaroo starts at location `x1` and moves at a rate of `v1` meters per jump.
- The first kangaroo starts at location `x2` and moves at a rate of `v2` meters per jump. 

You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.

For example, kangaroo `1` starts at `x1 = 2` with a jump distance `v1 =  1` and kangaroo `2` starts at `x2 = 1` with a jump distance of `v2 = 2`. After one jump, they are both at `x = 3`, (`x1 + v1 = 2 + 1`, `x2 + v2 = 1 + 2`), so our answer is YES.

__Function Description__

Complete the function kangaroo in the editor below. It should return YES if they reach the same position at the same time, or NO if they don't.

kangaroo has the following parameter(s):

- x1, v1: integers, starting position and jump distance for kangaroo 1
- x2, v2: integers, starting position and jump distance for kangaroo 2

__Input Format__

A single line of four space-separated integers denoting the respective values of `x1`, `v1`, `x2`, and `v2`.

__Constraints__

- 0 &le; x1 &le; x2 &le; 10000
- 1 &le; v1 &le; 10000
- 1 &le; v2 &le; 10000

__Output Format__

Print YES if they can land on the same location at the same time; otherwise, print NO.

__Note__: The two kangaroos must land at the same location after making the same number of jumps.

__Sample Input 0__
```
0 3 4 2
```
__Sample Output 0__
```
YES
```