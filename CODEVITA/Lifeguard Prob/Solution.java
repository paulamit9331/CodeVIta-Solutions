import java.util.Scanner;

public class Solution {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int xl = sc.nextInt();
		int yl = sc.nextInt();
		int xw = sc.nextInt();
		int yw = sc.nextInt();
		double f = sc.nextDouble();
		double a = 0.0;
		if(yl + yw == 0)
			a = xl * f;
		a = Math.floor(a);
		System.out.printf("%.6f", a);
	}
}