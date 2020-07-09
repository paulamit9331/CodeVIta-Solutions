#include<bits/stdc++.h>
#include<math.h>

using namespace std;

int main(int argc, char const *argv[]) {
	double p {0.0}, rate {0.0}, sum {0.0};
	int ten {0}, n {0}, year {0};
	cin >> p >> ten;

	double bank[2];
	for(int no = 0; no < 2; no++) {
		cin >> n;
		sum = 0;
		for(int i = 0; i < n; i++) {
			cin >> year >> rate;
			double sq = pow((1 + rate), year * 12);
			double emi = (p * rate) / (1 - 1 / sq);
			sum += emi;
		}
		bank[no] = sum;
	}
	if(bank[0] < bank[1])
		cout << "Bank A" << endl;
	else
		cout << "Bank B" << endl;

	return 0;
}