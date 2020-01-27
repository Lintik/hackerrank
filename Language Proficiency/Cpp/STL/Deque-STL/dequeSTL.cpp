#include <iostream>
#include <deque> 
using namespace std;

void printKMax(int arr[], int n, int k) 
{ 
    // Double ended Queue that stores indices
    deque<int> dq(k); 
  
    // populate dq with the first iteration
    int i; 
    for (i = 0; i < k; ++i) { 
        // remove insignificant indices
        while ((!dq.empty()) && arr[i] >= arr[dq.back()]) 
            dq.pop_back(); // Remove from rear 
        dq.push_back(i); // Add new element at rear of queue 
    } 
  
    // Process rest of the elements
    for (; i < n; ++i) { 
        cout << arr[dq.front()] << " "; 
  
        // Remove out-of-bounds indices
        while ((!dq.empty()) && dq.front() <= i - k) 
            dq.pop_front();
  
        // Remove elements smaller than the current 
        while ((!dq.empty()) && arr[i] >= arr[dq.back()]) 
            dq.pop_back(); 
  
        // Add current element at the rear of Qi 
        dq.push_back(i); 
    } 
  
    cout << arr[dq.front()];
    cout << endl;
} 
  

int main(){
  
	int t;
	cin >> t;
	while(t>0) {
		int n,k;
    	cin >> n >> k;
    	int i;
    	int arr[n];
    	for(i=0;i<n;i++)
      		cin >> arr[i];
    	printKMax(arr, n, k);
    	t--;
  	}
  	return 0;
}

