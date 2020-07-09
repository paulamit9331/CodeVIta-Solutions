#include <bits/stdc++.h>

using namespace std;

int IsPrimeSumExists(int *prime, int n) {
	int sum {0};
	for (int i = 2; i < n; ++i) {
		if(prime[i] == 1) {
			sum += i;
			if(sum == n)
				return 1;
		}
	}
	return 0;
}

int countConsecutivePrime(int n) {
	int *prime = new int[n + 1];
	for(int i = 0; i < n + 1; i++)
		prime[i] = 1;

	prime[0] = prime[1] = 0;

	for(int i = 2; i * i < n + 1; i++) {
		if(prime[i] == 1) {
			for(int j = i * i; j < n + 1; j += i)
				prime[j] = 0;
		}
	}

	int count {0};
	for(int i = 5; i < n + 1; i += 2) {
		if(prime[i] == 1)
			if(IsPrimeSumExists(prime, i))
				count++;
	}
	return count;
}

int main(int argc, char const *argv[]) {
	int n;
	cin >> n;

	cout << (countConsecutivePrime(n)) << endl;
	return 0;
}