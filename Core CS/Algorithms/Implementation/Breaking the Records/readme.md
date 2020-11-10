### __Breaking the Records__

Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.

For example, assume her scores for the season are represented in the array `scores = [12, 24, 10, 24]`. Scores are in the same order as the games played. She would tabulate her results as follows:

```
                   Count
Game  Score  Minimum  Maximum   Min Max
 0      12     12       12       0   0
 1      24     12       24       0   1
 2      10     10       24       1   1
 3      24     10       24       1   1
```

Given the scores for a season, find and print the number of times Maria breaks her records for most and least points scored during the season.

__Function Description__

Complete the breakingRecords function in the editor below. It must return an integer array containing the numbers of times she broke her records. Index `0` is for breaking most points records, and index `1` is for breaking least points records.

breakingRecords has the following parameter(s):

- scores: an array of integers

__Input Format__

The first line contains an integer `n`, the number of games.
The second line contains `n` space-separated integers describing the respective values of _score_<sub>0</sub>,  _score_<sub>1</sub>, ...,  _score_<sub>n-1</sub>.

__Constraints__

- 1 &le; _n_ &le; 1000
- 0 &le; _scores_[_i_] &le; 10<sup>8</sup>

__Output Format__

Print two space-seperated integers describing the respective numbers of times the best (highest) score increased and the worst (lowest) score decreased.

__Sample Input 0__
```
9
10 5 20 20 4 5 2 25 1
```
__Sample Output 0__
```
2 4
```

__Sample Input 1__
```
10
3 4 21 36 10 28 35 5 24 42
```

__Sample Output 1__
```
4 0
```