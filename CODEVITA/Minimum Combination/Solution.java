import java.util.Scanner;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static int calculateMinValue(int n1, int n2) {
		if(n1 == 0)
			return n2;
		return calculateMinValue(n2 % n1, n1);
	}

	public static void main(String[] args) {
		int t = 0;
		int n1 = 0;
		int n2 = 0;

		try {
			t = Integer.parseInt(sc.next());

			if(t < 1 || t > 1000)
				throw new Exception("");
		
		} catch(Exception e) {
			System.exit(-1);
		}

		for(int i = 0; i < t; i++) {
			try {
				n1 = Integer.parseInt(sc.next());
				n2 = Integer.parseInt(sc.next());

				if((n1 < 0 || n1 > Math.pow(10, 7)) || (n2 < 0 || n2 > Math.pow(10, 7)))
					throw new Exception("");
			
			} catch(Exception e) {
				System.exit(-1);
			}

			System.out.println(calculateMinValue(n1, n2));
		}
		sc.close();
	}
}