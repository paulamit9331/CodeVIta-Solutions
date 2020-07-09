#include <bits/stdc++.h>

using namespace std;

int countInRange(int *array, int n, int l, int r) {
	int count = 0;
	for(int i = 0; i < n; i++) {
		if(array[i] >= l && array[i] <= r)
			count++;
	}
	return count;
}

int main(int argc, char const *argv[]) {
	int n {0}, range {0};
	int l {0}, r {0};
	cin >> n >> range;
	
	int *array = new int[n];
	for (int i = 0; i < n; i++) {
		cin >> array + i;
	}

	int op[range];
	for(int i = 0; i < range; i++) {
		cin >> l >> r;
		op[i] = countInRange(array, n, l, r);
	}

	for (int x : op) {
		cout << x << " ";
	}
	cout << endl;
	return 0;
}