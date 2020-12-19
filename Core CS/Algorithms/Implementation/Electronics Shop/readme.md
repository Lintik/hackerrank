### __Electronics Shop__

A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget. Given price lists for keyboards and USB drives and a budget, find the cost to buy them. If it is not possible to buy both items, return `-1`.

__Example__
```
b = 60
keyboards = [40, 50, 60]
drives = [5, 8, 12]
```

The person can buy a `40 keyboard + 12 USB drive`, or a `50 keyboard + 8 USB drive = 58`. Choose the latter as the more expensive option and return `58`.

__Function Description__

Complete the getMoneySpent function in the editor below.

getMoneySpent has the following parameter(s):

- int keyboards[n]: the keyboard prices
- int drives[m]: the drive prices
- int b: the budget

__Returns__

- int: the maximum that can be spent, or `-1` if it is not possible to buy both items

__Input Format__

The first line contains three space-separated integers
`b`, `n`, and `m`, the budget, the number of keyboard models and the number of USB drive models.  

The second line contains `n` space-separated integers `drives`, the prices of each keyboard model.  

The third line contains `m` space-separated integers `drives`, the prices of the USB drives.

__Constraints__

- 1 &le; n, m &le; 1000
- 1 &le; b &le; 10<sup>6</sup>
- The price of each item is in the inclusive range [1, 10<sup>6</sup>].

__Sample Input 0__

```
10 2 3
3 1
5 2 8
```

__Sample Output 0__

```
9
```

__Explanation 0__

Buy the 2<sup>nd</sup> keyboard and the 3<sup>rd</sup> USB drive for a total cost of `8 + 1 = 9`.

__Sample Input 1__
```
5 1 1
4
5
```
__Sample Output 1__
```
-1
```
__Explanation 1__

There is no way to buy one keyboard and one USB drive because `4 + 5 > 5`, so return `-1`.