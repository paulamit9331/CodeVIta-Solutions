import java.util.Scanner;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static String removeDuplicates(String str) {
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(!result.contains(String.valueOf(str.charAt(i))))
				result += String.valueOf(str.charAt(i));
		}
		return result;
	}

	private static int[] charToVal(String str) {
		int[] array = new int[str.length()];

		for(int i = 0; i < array.length; i++) {
			array[i] = (int)str.charAt(i) - 96;
		}
		return array;
	}

	private static int necklacePrice(int[] array) {
		int sum = 0;

		for(int i = 0; i < array.length; i++) {
			sum += (array[i] * (i + 1));
		}
		return sum;
	}

	public static void main(String[] args) {
		int t = 0;
		String str = null;

		try {
			t = Integer.parseInt(sc.next());

			if(t < 1 || t > 500)
				throw new Exception("");
		
		} catch(Exception e) {
			System.exit(-1);
		}

		for(int i = 0; i < t; i++) {
			str = sc.next();

			for(int j = 0; j < str.length(); j++) {
				if(((int)str.charAt(j) - 97) < 0)		// only small letter checking
					System.exit(-1);
			}

			String str1 = removeDuplicates(str);
			int[] array = charToVal(str1);
			int n1 = necklacePrice(array);

			String str2 = removeDuplicates(new StringBuffer(str).reverse().toString());
			array = charToVal(str2);
			int n2 = necklacePrice(array);

			if(n1 > n2)
				System.out.println(n2);
			else
				System.out.println(n1);
		}
		sc.close();
	}
}