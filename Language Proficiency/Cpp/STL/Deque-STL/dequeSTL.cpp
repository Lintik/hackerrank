#include <iostream>
#include <deque>
#include <vector>
using namespace std;

void printKMax(vector<int> &arr, int n, int k){
    deque<int> dq;
    int m = 0;
    for(int i = 0;i < k;i++){
        dq.push_back(arr[i]);
        if(arr[i] > m)
            m = arr[i];
    }
    cout << m;
    for(int i = 1;i < n - k + 1;i++){
        if(arr[i] == m){
            m = 0;
            dq.pop_front();
            dq.push_back(arr[i]);
            for(int j = 0;j < k;j++){
                if(dq[j] > m)
                    m = dq[j];
            }
        }
        if(arr[i+k-1] >= m){
            m = arr[i];
            dq.pop_front();
            dq.push_back(arr[i]);
        }
        else{
            dq.pop_front();
            dq.push_back(arr[i]);
        }
        cout << " " << m;
    }
    cout << endl;
}

int main(){
    int t;
	cin >> t;
	while(t>0) {
		int n,k;
    	cin >> n >> k;
    	int i;
    	vector<int> arr(n);
    	for(i=0;i<n;i++)
      		cin >> arr[i];
    	printKMax(arr, n, k);
    	t--;
  	}
  	return 0;
}