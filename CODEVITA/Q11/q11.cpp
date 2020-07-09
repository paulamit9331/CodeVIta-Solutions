#include <bits/stdc++.h>
#include <math.h>
#include <vector>

using namespace std;

int hroot(int n) {
	int root1 = (1 + sqrt(1 + (8 * n))) / 4;
	int root2 = (1 - sqrt(1 + (8 * n))) / 4;

	return (root1 >= root2)? root1: root2;
}

int troot(int n) {
	int root1 = (-1 + sqrt(1 + (8 * n))) / 2;
	int root2 = (-1 - sqrt(1 + (8 * n))) / 2;

	return (root1 >= root2)? root1: root2;
}

int H(int n) {
	return n * (2 * n - 1);
}

int T(int n) {
	return n * (n + 1) / 2;
}

std::vector<int> getIntersection(std::vector<int> h, std::vector<int> t) {
	std::vector<int> intersect;

	int hIndex {0};
	int tIndex {0};
	while(tIndex < t.size() && hIndex < h.size()) {
		if(h[hIndex] == t[tIndex]) {
			intersect.push_back(h[hIndex]);
			tIndex++;
			hIndex++;
		} else if(h[hIndex] > t[tIndex])
			tIndex++;
		else
			hIndex++;
	}
	return intersect;
}

int nthNumberSeries(int start, int end, int n) {
	int hlow = hroot(start);
	int hhigh = hroot(end);
	std::vector<int> h;

	for(int i = hlow; i <= hhigh; i++)
		h.push_back(H(i));

	int tlow = troot(start);
	int thigh = troot(end);
	std::vector<int> t;

	for(int i = tlow; i <= thigh; i++)
		t.push_back(T(i));

	std::vector<int> intersect = getIntersection(h, t);

	if(n <= intersect.size())
		return intersect[n - 1];
	else
		return -1;
}

int main(int argc, char const *argv[]) {
	int start {0}, end {0}, n {0};
	cin >> start >> end >> n;

	cout << nthNumberSeries(start, end, n) << endl;
	return 0;
}