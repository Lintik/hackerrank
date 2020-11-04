#include <bits/stdc++.h>

using namespace std;

vector <int> gradingStudents(vector < int > grades){
    for(int i=0;i<grades.size();i++){
        if(grades[i]>=38 && grades[i]%5>2)
            grades[i] = grades[i] - grades[i]%5 + 5;
    }
    return grades;
}

int main() {
    int n;
    cin >> n;
    vector<int> grades(n);
    for(int grades_i = 0; grades_i < n; grades_i++){
       cin >> grades[grades_i];
    }
    vector <int> result = gradingStudents(grades);
    for (ssize_t i = 0; i < result.size(); i++) {
        cout << result[i] << (i != result.size() - 1 ? "\n" : "");
    }
    cout << endl;
    

    return 0;
}
