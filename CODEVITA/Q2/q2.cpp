#include<bits/stdc++.h>
#include<string.h>

using namespace std;

void checkSuperString(string str, int n) {
	int ascii[26];
	for(int i = 0; i < 26; i++)
		ascii[i] = 0;

	for (int i = 0; i < n; ++i) {
		ascii[(int)str[i] - 97]++;
	}

	int count = 0;
	for (int i = 0; i < 26; ++i) {
		if(ascii[i] == i + 1 || ascii[i] == 0)
			count = 1;
		else {
			count = 0;
			break;
		}
	}

	if(count != 0)
		cout << "Yes" << endl;
	else
		cout << "No" << endl;
}

int main(int argc, char const *argv[]) {
	int t {0};
	cin >> t;

	string str {NULL};
	while(t--) {
		cin >> str;
		int n = 0;
		int i = 0;
		checkSuperString(str, str.size());
	}
	
	return 0;
}