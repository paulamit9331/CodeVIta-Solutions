import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static boolean isDigit(char ch) {
		return (ch >= '0' && ch <= '9');
	}

	private static int findNum(String num) {
		char[] array = num.toCharArray();
		Arrays.sort(array);
		char base = array[array.length - 1];

		return isDigit(base)? (base - '0'): (base - 55);
	}

	private static int findValueInDecimal(String str) {
		int base = findNum(str) + 1;
		int res = 0;
		int n = str.length() - 1;

		for(char ch : str.toCharArray()) {
			res += findNum(String.valueOf(ch)) * Math.pow(base, n--);
		}
		return res;
	}

	public static void main(String[] args) {
		String[] str = sc.nextLine().split(" ");
		int[] array = new int[str.length];

		int i = 0;
		for(String s: str)
			array[i++] = findValueInDecimal(s);
		
		Arrays.sort(array);
		System.out.println(array[0]);
	}
}