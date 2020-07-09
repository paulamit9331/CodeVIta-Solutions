#include <bits/stdc++.h>

using namespace std;

int kthFactor(int n, int k) {
	for(int i = n; i <= 1; i--) {
		if(n % i == 0)
			count++;
		if(c == k)
			return count;
	}
	return 1;
}

int main(int argc, char const *argv[]) {
	int n {0}, k {0};
	cin >> n >> k;

	cout << kthFactor(n, k) << endl;

	return 0;
}