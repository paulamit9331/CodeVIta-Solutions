import java.util.*;

public class Solution {
	private static final double pi = 3.14;

	private static double volume(double rad) {
		return (4 / 3) * pi * Math.pow(rad, 3);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		double[] rad = new double[day];
		
		for(int i = 0; i < day; i++)
			rad[i] = sc.nextDouble();

		double per = sc.nextDouble();
		Arrays.sort(rad);

		double[] vol = new double[day];
		for(int i = 0; i < day; i++) {
			vol[i] = volume(rad[i]) * Math.pow((per / 100), day - i);
		}

		double sum = 0;

		for(double i : vol)
			sum += i;

		System.out.println(sum);
	}
}