n = int(input())
r1, r2 = input().split()
r1 = int(r1)
r2 = int(r2)
target = int(input())
muppai = [4, 6, 9, 11]
muppaiokati = [1, 3, 5, 7, 8, 10, 12]
for i in range(1, n + 1):
	tot = 0
	for m in range(1, 13):
		if m in muppai:
			for d in range(1, 31):
				pat = pow((6 - m), 2) + abs(d - 15)
				if(pat >= n):
					tot += (((n - i) * r2) + (i * r1))
				elif pat <= (n - i):
					tot += (pat * r2)
				else:
					tot += (((n - i) * r2) + (pat - n + i) * r1)
		elif m in muppaiokati:
			for d in range(1, 32):
				pat = pow((6 - m), 2) + abs(d - 15)
				if(pat >= n):
					tot += (((n - i) * r2) + (i * r1))
				elif pat <= (n - i):
					tot += (pat * r2)
				else:
					tot += (((n - i) * r2) + (pat - n + i) * r1)
		else:
			for d in range(1, 29):
				pat = pow((6 - m), 2) + abs(d - 15)
				if(pat >= n):
					tot += (((n - i) * r2) + (i * r1))
				elif pat <= (n - i):
					tot += (pat * r2)
				else:
					tot += (((n - i) * r2) + (pat - n + i) * r1)

	if(tot >= target):
		print(i)
		break
if tot < target:
	print(tot)