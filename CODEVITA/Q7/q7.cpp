#include <bits/stdc++.h>

using namespace std;

typedef struct wallet {
	int five;
	int two;
	int one;
};

int countCoin(int amt, wallet *count) {
	count->five = (amt - 4) / 5;
	amt -= count->five * 5;

	if(amt % 2 == 0)
		count->one = 2;
	else
		count->one = 1;

	amt -= count->one;
	count->two = amt / 2;

	return (count->five + count->two + count->one);
}

int main(int argc, char const *argv[]) {
	int amt {0};
	cin >> amt;

	wallet count = {0, 0, 0};
	cout << countCoin(amt, &count) << " " << count.five << " " << count.two << " " << count.one << endl;
	return 0;
}