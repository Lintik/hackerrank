using System.IO;
using System.Linq;
using System.Collections.Generic;
using System;

class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(string[] magazine, string[] note) {
        Dictionary<string, int> words = new Dictionary<string, int>();
        foreach(string word in magazine){
            if(words.ContainsKey(word)){
                words[word]++;
            }
            else{
                words.Add(word, 1);
            }
        }
        foreach(string word in note){
            if(words.ContainsKey(word)){
                words[word]--;
                if(words[word] < 0){
                    Console.WriteLine("No");
                    return;
                }
            }
            else{
                Console.WriteLine("No");
                return;
            }
        }
        Console.WriteLine("Yes");

    }

    static void Main(string[] args) {
        string[] mn = Console.ReadLine().Split(' ');

        int m = Convert.ToInt32(mn[0]);

        int n = Convert.ToInt32(mn[1]);

        string[] magazine = Console.ReadLine().Split(' ');

        string[] note = Console.ReadLine().Split(' ');

        checkMagazine(magazine, note);
    }
}
