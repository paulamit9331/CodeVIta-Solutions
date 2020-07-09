import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static int maximumUniformitySubString(String str, int k) {
		if(str = null)
			return 0;
		else if(str.length == 1)
			return 1;
		else {
			
		}
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(sc.next());
		String str = sc.next();

		if(str.length != n)
			System.exit(-1);

		int k = Integer.parseInt(sc.next());

		System.out.println(maximumUniformitySubString(str, k));
	}
}