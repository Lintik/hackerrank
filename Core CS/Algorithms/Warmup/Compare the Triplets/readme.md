### __Compare the Triplets__

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from `1` to `100` for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet __*a* = (*a*[0], *a*[1], *a*[2])__, and the rating for Bob's challenge to be the triplet __*b* = (*b*[0], *b*[1], *b*[2])__.


Your task is to find their comparison points by comparing __*a*[0]__ with __*b*[0]__, __*a*[1]__ with __*b*[1]__, and __*a*[2]__ with __*b*[2]__

* If __*a*[*i*] &gt; *b*[*i*]__, then Alice is awarded 1 point.
* If __*a*[*i*] &lt; *b*[*i*]__, then Bob is awarded 1 point.
* If __*a*[*i*] = *b*[*i*]__, then neither person receives a point.

Comparison points is the total points a person earned.

Given __*a*__ and __*b*__, determine their respective comparison points.

For example, __*a* = [1,2,3]__ and __*b* = [3,2,1]__. For elements __0__, Bob is awarded a point because __*a*[*0*] &gt; *b*[*0*]__. For the equal elements __*a*[1]__ and __*b*[1]__, no points are earned. Finally, for elements __2__, __*a*[2] &gt; *b*[2]__ so Alice receives a point. Your return array would be __[1,1]__ with Alice's score first and Bob's second. 

__Function Description__

Complete the function compareTriplets in the editor below. It must return an array of two integers, the first being Alice's score and the second being Bob's.

compareTriplets has the following parameter(s):

+ a: an array of integers representing Alice's challenge rating
+ b: an array of integers representing Bob's challenge rating


__Input Format__

The first line contains __3__ space-separated integers, __*a*[0]__, __*a*[1]__, and __*a*[2]__, describing the respective values in triplet __*a*__. 
The second line contains __3__ space-separated integers,__*b*[0]__, __*b*[1]__, and __*b*[2]__, describing the respective values in triplet __*b*__.

__Constraints__
* __*1 &le; a[i] &le; 100*__
* __*1 &le; b[i] &le; 100*__

__Output Format__

Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

__Sample Input 0__
```
5 6 7
3 6 10
```
__Sample Output 0__
```
1 1
```
__Explanation__

In this example:
* __*a = (a[0], a[1], a[2]) = (5, 6, 7)*__
* __*b = (b[0], b[1], b[2]) = (3, 6, 7)*__ 

Now, let's compare each individual score:

* __*a*[*0*] &gt; *b*[*0*]__, so Alice receives __1__ point.
* __*a*[*1*] = *b*[*1*]__, so nobody receives a point.
* __*a*[*2*] &lt; *b*[*2*]__, so Bob receives  point.

Alice's comparison score is __1__, and Bob's comparison score is __1__. Thus, we return the array __[1,1]__.

__Sample Input 1__
```
17 28 30
99 16 8
```
__Sample Output 1__
```
2 1
```

__Explanation 1__

Comparing  the __0<sup>*th*</sup>__ elements, __17 &lt; 99__ so Bob receives a point. Comparing the __1<sup>*st*</sup>__ and __2<sup>*nd*</sup>__ elements, __28 &gt; 8__ and so Alice receives two points.  
The return array is __[2,1]__. 