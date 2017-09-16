Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: *problem clarity, originality, and difficulty*.

We define the rating for Alice's challenge to be the triplet *A = (a<sub>0</sub>, a<sub>1</sub>, a<sub>2</sub>)*, and the rating for Bob's challenge to be the triplet B = (*b*<sub>0</sub>, *b*<sub>1</sub>, *b*<sub>2</sub>).

Your task is to find their comparison points by comparing  with ,  with , and  with .

* If *a<sub>i</sub> >  b<sub>i</sub>*, then Alice is awarded 1 point.
* If *a<sub>i</sub> <  b<sub>i</sub>*, then Bob is awarded 1 point.
* If *a<sub>i</sub> =  b<sub>i</sub>*, then neither person receives a point.
Comparison points is the total points a person earned.

Given *A* and *B*, can you compare the two challenges and print their respective comparison points?

__Input Format__

The first line contains 3 space-separated integers, *a<sub>0</sub>*, *a<sub>1</sub>*, and *a<sub>2</sub>*, describing the respective values in triplet *A*. 
The second line contains 3 space-separated integers, *b<sub>0</sub>*, *b<sub>1</sub>*, and *b<sub>2</sub>*, describing the respective values in triplet *B*.

__Constraints__
* *1 &#8806;*
* *1 &#8806;*

__Output Format__

Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

__Sample Input__

5 6 7
3 6 10

__Sample Output__

1 1 
__Explanation__

In this example:

Now, let's compare each individual score:

, so Alice receives  point.
, so nobody receives a point.
, so Bob receives  point.
Alice's comparison score is , and Bob's comparison score is . Thus, we print 1 1 (Alice's comparison score followed by Bob's comparison score) on a single line.
