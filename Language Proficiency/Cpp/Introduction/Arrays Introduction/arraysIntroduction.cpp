#include <iostream>
using namespace std;

int main() {
    int i;
    cin >> i;
    int n[i];
    for(int j = 0; j < i;j++){
        cin >> n[j];
    }
    for(int j = i - 1;j >= 0;j--)
        cout << n[j] << " ";
    return 0;
}
