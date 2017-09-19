using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int[] solve(int[] grades){
        // Complete this function
        for(int i=0;i<grades.Length;i++){
        if(grades[i]>=38 && grades[i]%5>2)
            grades[i] = grades[i] - grades[i]%5 + 5;
        }
        return grades;
    }

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] grades = new int[n];
        for(int grades_i = 0; grades_i < n; grades_i++){
           grades[grades_i] = Convert.ToInt32(Console.ReadLine());   
        }
        int[] result = solve(grades);
        Console.WriteLine(String.Join("\n", result));
        

    }
}
