using System;
using System.Collections.Generic;
using System.IO;
using System.Numerics;
class Solution
{
    static void Main(String[] args)
    {
        BigInteger Sum = new BigInteger();
        int Factorial = Convert.ToInt32(Console.ReadLine());
        Sum = 1;
        for (int i = 1; i < Factorial + 1; i++){
            Sum *= i;
        }
        Console.WriteLine(Sum);
        Console.ReadLine();
    }
}
