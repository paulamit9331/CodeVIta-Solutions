import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);
	private static List<Integer> list = new ArrayList<Integer>();

	private static boolean isPrime(int num) {
		if(num <= 1)
			return false;
		for(int i = 2; i < num; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}

	private static long fibonacci(int n, int first, int second) {
		long[] dp = new long[n];
		dp[0] = first;
		dp[1] = second;

		for(int i = 2; i < n; i++)
			dp[i] = dp[i - 1] + dp[i - 2];

		return dp[n - 1];
	}

	private static ArrayList<Integer> uniqueCombination() {
		Set<Integer> set = new HashSet<Integer>();

		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.size(); j++) {
				if(i != j) {
					int n = Integer.parseInt("" + list.get(i) + list.get(j));
					set.add(n);
				}
			}
		}

		ArrayList<Integer> newList = new ArrayList<Integer>();
		Iterator<Integer> i = set.iterator();
		while(i.hasNext())
			newList.add(i.next());
		
		return newList;
	}

	public static void main(String[] args) {
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		for(int i = n1; i <= n2; i++) {
			if(isPrime(i))
				list.add(i);
		}

		ArrayList<Integer> newList = uniqueCombination();
		list.clear();

		for(int i = 0; i < newList.size(); i++) {
			if(isPrime(newList.get(i)))
				list.add(newList.get(i));
		}
		Collections.sort(list);

		int count = list.size();
		System.out.println(fibonacci(count, list.get(0), list.get(list.size() - 1)));
	}
}