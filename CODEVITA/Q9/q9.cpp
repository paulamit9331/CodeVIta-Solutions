#include <bits/stdc++.h>
#include<vector>

using namespace std;

int findMinTime(int *arr, int n) {
	vector<int> v;
	int time {0}, sum {0};
	
	for(int i = 0; i < n; i++) {
		sum += arr[i];
		if(i != 0)
			v.push_back(sum);
	}

	for (int i = 0; i < v.size(); ++i)
		time += v[i];

	return time;
}

int main(int argc, char const *argv[]) {
	int t {0};
	cin >> t;

	while(t--) {
		int n {0};
		cin >> n;
		int *arr = new int[n];
		for(int i = 0; i < n; i++)
			cin >> arr[i];

		sort(arr, arr + n);
		cout << findMinTime(arr, n) << endl;
	}
	return 0;
}