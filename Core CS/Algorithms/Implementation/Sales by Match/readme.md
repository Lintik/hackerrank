### __Sales by Match__

Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are `n = 7` socks with colors `ar = [1,2,1,2,1,3,2]`. There is one pair of color `1` and one of color `2`. There are three odd socks left, one of each color. The number of pairs is `2`.

__Function Description__

Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.

sockMerchant has the following parameter(s):

- n: the number of socks in the pile
- ar: the colors of each sock

__Input Format__

The first line contains an integer `n`, the number of socks represented in `ar`.
The second line contains `n` space-separated integers describing the colors `ar[i]` of the socks in the pile.

__Constraints__

- 1 &le; _n_ &le; 100
- 1 &le; _ar_[_i_] &le; 100 where 0 &le; _i_ &le; _n_

__Output Format__

Return the total number of matching pairs of socks that Alex can sell.

__Sample Input__
```
9
10 20 20 10 10 30 50 10 20
```
__Sample Output__
```
3
```