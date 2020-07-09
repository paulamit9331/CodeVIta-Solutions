import math
C = int(input())
T = {}
collition = 0
for i in range(C):
	x, y, v = list(map(int, input().split()))
	t = math.sqrt((x / v)**2 + (y / v)**2)
	if(T.get(t) == None):
		T[t] = 1
	else:
		T[t] += 1
for keys in T:
	if(T[keys] != 1):
		collition = collition + (T[keys] * (T[keys] - 1)) / 2

print(int(collition))