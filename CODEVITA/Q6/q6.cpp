#include<bits/stdc++.h>

using namespace std;

void printLongestIncSubArray(int *arr, int n) {
	int max = 1, len = 1, maxIndex = 0;
	for (int i = 1; i < n; i++) {
		if(arr[i] >= arr[i - 1])
			len++;
		else {
			
			if(max < len) {
				max = len;
				maxIndex = i - max;
			}
			len = 1;
		}
	}
	
	if(max < len) {
		max = len;
		maxIndex = n - max;
	}

	for (int i = maxIndex; i < max + maxIndex; i++)
		cout << arr[i] << " ";

	cout << endl;
}

int main(int argc, char const *argv[]) {
	int t{0}, n{0};
	cin >> t;

	while(t-- > 0) {
		cin >> n;
		int *arr = new int[n];
		for(int i = 0; i < n; i++)
			cin >> arr + i;
		printLongestIncSubArray(arr, n);
	}
	
	return 0;
}