### __Bill Division__

Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they consume. Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.

For example, assume the bill has the following prices: `bill = [2,4,6]`. Anna declines to eat item `k = bill[2]` which costs `6`. If Brian calculates the bill correctly, Anna will pay `(2 + 4)/2 = 6`. If he includes the cost of `bill[2]`, he will calculate `(2 + 4 + 6)/2 = 6`. In the second case, he should refund `3` to Anna.

__Function Description__

Complete the bonAppetit function in the editor below. It should print `Bon Appetit` if the bill is fairly split. Otherwise, it should print the integer amount of money that Brian owes Anna.

bonAppetit has the following parameter(s):

- bill: an array of integers representing the cost of each item ordered
- k: an integer representing the zero-based index of the item Anna doesn't eat
- b: the amount of money that Anna contributed to the bill

__Input Format__

The first line contains two space-separated integers `n` and `k`, the number of items ordered and the `0`-based index of the item that Anna did not eat.
The second line contains n space-separated integers `bill[i]` where 0 &le; _i_ &lt; _n_.
The third line contains an integer, `b`, the amount of money that Brian charged Anna for her share of the bill.

__Constraints__
- 2 &le; _n_ &le; 10<sup>5</sup>
- 0 &le; _k_ &lt; _n_
- 0 &le; _bill_[_i_] &le; 4
- 0 &le; _b_ &le; (bill[0] + bill[1] + ... + bill[n-1])
- The amount of money due Anna will always be an integer

__Output Format__

If Brian did not overcharge Anna, print `Bon Appetit` on a new line; otherwise, print the difference that Brian must refund to Anna. This will always be an integer.

__Sample Input 0__
```
4 1
3 10 2 9
12
```
__Sample Output 0__
```
5
```
__Sample Input 1__
```
4 1
3 10 2 9
7
```
__Sample Output 1__
```
Bon Appetit
```