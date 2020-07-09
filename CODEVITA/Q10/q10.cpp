#include <bits/stdc++.h>

using namespace std;

int maximumProductArray(int *arr1, int *arr2, int n, int k) {
	int max {INT_MIN}, min {INT_MAX};
	int minIndex {-1}, maxIndex {-1};
	for(int i = 0; i < n; i++) {
		if(arr2[i] > max) {
			max = arr2[i];
			maxIndex = i;
		}
		if(arr2[i] < min) {
			min = arr2[i];
			minIndex = i;
		}
	}

	int pro1 = abs(max * arr1[maxIndex]);
	int pro2 = abs(min * arr1[minIndex]);
	if(pro1 > pro2)
		arr1[maxIndex] += (k * 2);
	else
		arr1[minIndex] += (k * 2);

	int sum = 0;
	for(int i = 0; i < n; i++)
		sum += (arr1[i] * arr2[i]);

	return sum;

}

int main(int argc, char const *argv[]) {
	int n {0}, k {0};
	cin >> n >> k;

	int *arr1 = new int[n];
	for(int i = 0; i < n; i++)
		cin >> arr1[i];

	int *arr2 = new int[n];
	for(int i = 0; i < n; i++)
		cin >> arr2[i];

	cout << maximumProductArray(arr1, arr2, n, k) << endl;
	return 0;
}