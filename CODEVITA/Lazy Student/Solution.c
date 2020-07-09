#include <stdio.h>

unsigned long long int combinations(unsigned long long int n, unsigned long long int r) {
	unsigned long long int i, result;
	unsigned long long int numerator = 1;
	unsigned long long int denominator = 1;

	for(i = 1; i <= r; i++) {
		denominator *= i;
		numerator *= (n - (i - 1));
	}
	result = numerator / denominator;
	return result;
}

unsigned long long int calcgcd(unsigned long long int n1, unsigned long long int n2) {
	if(n1 == 0)
		return n2;
	else
		return calcgcd(n2 % n1, n1);
}

unsigned long long int mulinv(unsigned long long int a) {
	unsigned long long int m = 1000000007, i, b;
	for(i = 1; i < m; i++) {
		if((i * m + 1) % a == 0) {
			b = (i * m + 1) / a;
			break;
		}
	}
	return b;
}

int main(int argc, char const *argv[]) {
	int t, i;
	scanf("%d", &t);
	for(i = 1; i <= t; i++) {
		unsigned long long int qu, l, c, u;
		unsigned long long int wc, wf, p, q, gcd, result;
		scanf("%llu %llu %llu", &qu, &l, &c);
		u = qu - 1;
		wc = combinations(qu, c);
		wf = combinations(u, c);
		p = wc - wf;
		q = wc;
		gcd = calcgcd(p, q);
		if(gcd != 1) {
			p /= gcd;
			p /= gcd;
		}
		result = (p * mulinv(q)) % 1000000007;
		printf("%llu\n", result);
	}
	return 0;
}