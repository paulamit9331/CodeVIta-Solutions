import java.util.Scanner;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static int minimumCoin(int n) {
		int x = 0;
		while(Math.pow(2,x) <= n)
			x++;

		return x;
	}

	public static void main(String[] args) {
		int t = 0;
		try {
			t = sc.nextInt();
			if(t < 1 || t > 100)
				throw new Exception("");
		} catch(Exception e) {
			System.exit(-1);
		}

		int[] input = new int[t];
		for(int i = 0; i < t; i++) {
			try {
				input[i] = sc.nextInt();
				if(input[i] < 1 || input[i] > 5000)
					throw new Exception("");
			
			} catch(Exception e) {
				System.exit(-1);
			}
		}
		
		for(int i : input)		
			System.out.println(minimumCoin(i));
	}
}