### __Birthday Cake Candles__

You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest. 

__Example__

### _candles_ = [4, 4, 1, 3]

The maximum height candles `4` are units high. There are `2` of them, so return `2`.

__Function Description__

Complete the function `birthdayCakeCandles` in the editor below.

birthdayCakeCandles has the following parameter(s):

- int candles[n]: the candle heights

__Returns__
- int: the number of candles that are tallest

__Input Format__
  
The first line contains a single integer _n_, , the size of _candles_.  
The second line contains _n_ space-separated integers, where each integer _i_ describes the height of _candles_[_i_].

__Constraints__

- 1 &le; _n_ &le; 10<sup>5</sup>
- 1 &le; _candles_[_i_] &le; 10<sup>7</sup>

__Sample Input 0__
```
4
3 2 1 3
```

__Sample Output 0__
```
2
```

__Explanation 0__

Candle heights are `[3, 2, 1, 3]`. The tallest candles are `3` units, and there are `2` of them.