import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			final long x = sc.nextLong();
			String str = Long.toString((long)Math.pow(1 << 1, x));
			str = str.length() > 2? str.substring(str.length() - 2): str;

			sum += Integer.parseInt(str);
		}
		return (sum % 100);
	}
}