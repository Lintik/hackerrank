# Print Pretty

Your manager gave you a text file with many lines of numbers to format and print. For each row of __3__ space-separated doubles, format and print the numbers using the specifications in the Output Format section
below.

**Input Format**

The first line contains an integer, __*T*__, the number of test cases. 
Each of the __*T*__ subsequent lines describes a test case as __3__ space-separated floating-point numbers: __*A*__, __*B*__, and __*C*__, respectively.

**Constraints**
> __1 &le; *T* &le; 1000__  
Each number will fit into a double.

**Output Format**

For each test case, print __3__ lines containing the formatted __*A*__, __*B*__, and __*C*__, respectively. Each __*A*__, __*B*__, and __*C*__ must be formatted as follows:

1. __*A*__: Strip its decimal (i.e., truncate it) and print its hexadecimal representation (including the __0x__ prefix) in lower case letters.

2. __*B*__: Print it to a scale of __2__ decimal places, preceded by a   &plus; or &minus; sign (indicating if it's positive or negative), right justified, and left-padded with underscores so that the printed result is exactly __15__ characters wide.

3. __*C*__: Print it to a scale of exactly nine decimal places, expressed in scientific notation using upper case.

**Sample Input**

```
1  
100.345 2006.008 2331.41592653498
```
**Sample Output**

```
0x64             
_______+2006.01  
2.331415927E+03
```
**Explanation**

For the first line of output, __(100)<sub>10</sub> &rarr; (64)<sub>16</sub>__ (in reverse, __6 &times; 16<sup>1</sup> &plus; 4 &times; 16<sup>0</sup> &equals; (100)<sub>10</sub>__ ).  
The second and third lines of output are formatted as described in the Output Format section.


