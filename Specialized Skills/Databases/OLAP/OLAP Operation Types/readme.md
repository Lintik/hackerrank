# Question

Consider a fact table DataPoint(D1, D2, D3, x), and the following three quesries

```sql
Select D1, D2, D3, Sum(x) From Datapoints Group By D1, D2, D3
```

```sql
Select D1, D2, D3, Sum(x) From Datapoints Group By D1, D2, D3 WITH CUBE
```

```sql
Select D1, D2, D3, Sum(x) From Datapoints Group By D1, D2, D3 WITH ROLLUP
```

Suppose attributes D1, D2, and D3 have n1, n2, and n3 different values respectively, and assume that each possible combination of values appears at least once in the table DataPoints. The number of tuples in the result of each of the three queries above can be specified as an arithmetic formula involving n1, n2, and n3. Pick the one tuple (a,b,c,d,e,f) in the list below such that when n1=a, n2=b, and n3=c, then the result sizes of queries Q1, Q2, and Q3 are d, e, and f respectively.

+ (2, 2, 2, 6, 18, 8)
+ (2, 2, 2, 8, 64, 15)
+ (5, 10, 10, 500, 1000, 550)
+ (4, 7, 3, 84, 160, 117)

Answer: 