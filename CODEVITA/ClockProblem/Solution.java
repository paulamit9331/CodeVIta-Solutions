import java.util.Scanner;

public class Solution {
	private static final int UTC = 0;
	private static Scanner sc = new Scanner(System.in);

	private static double calculateAngle(int rotationPeriod, double longitude) {
		double time = UTC + (rotationPeriod / 360.0) * longitude;
		int hour = (int)(time * 60) / 60;
		int minute = (int)(time * 60) % 60; 

		double angle = Math.abs(((11.0 / 2) * minute)  - (30.0 * hour));

		if(angle == 360)
			return 0.00;
		else
        	return angle;
	}

	public static void main(String[] args) {
		int rotationPeriod = sc.nextInt();
		double longitude = sc.nextDouble();

		System.out.printf("%.2f", calculateAngle(rotationPeriod, longitude));
	}

}