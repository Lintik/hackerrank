#include <bits/stdc++.h>
typedef long long LL;
using namespace std;

int main(){
	LL s[5];
	LL d = 0;
	for(int i = 0; i < 5; i++){
		cin >> s[i];
		d += s[i];
	}
	sort(s,s+5);
	cout << d-s[4] << " " << d-s[0] << endl;
}
