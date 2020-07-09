import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static int specialArray(int[] array, int n) {
		int[] count = new int[n];
		for(int i = 0; i < n; i++)
			count[i] = 0;

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(array[i] != array[j])
					count[i] += Math.abs(array[i] - array[j]);
			}
		}
		Arrays.sort(count);
		return count[0];
	}

	public static void main(String[] args) {
		int t = 0;
		int n = 0;
		// for test cases
		try {
			t = sc.nextInt();

			if(t < 1 || t > 10)
				throw new Exception("");
		
		} catch(Exception e) {
			System.exit(-1);
		}
		// for number of elements in array
		try {
			n = sc.nextInt();
			if(n < 1 || n > 10000)
				throw new Exception("");
		} catch(Exception e) {
			System.exit(-1);
		}
		int[] array = new int[n];

		for(int i = 0; i < t; i++) {
			try {
				for(int j = 0; j < n; j++) {
					array[j] = sc.nextInt();

					if(array[j] < 1 || array[j] > 10000)
						throw new Exception("");
				}
			} catch(Exception e) {
				System.exit(-1);
			}
			System.out.println(specialArray(array, n) % 1000007);
		}
	}
}