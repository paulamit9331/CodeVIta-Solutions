import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	private static boolean checkAnagram(String str, String original) {
		int n = str.length();
		for(int i = 0; i <= original.length() - n; i++) {
			char[] ch = original.substring(i, i + n).toCharArray();
			String.valueOf(String.valueOf(ch));
			Arrays.sort(ch);
			String temp = String.valueOf(ch);

			if(temp.equals(str))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str = sc.next();
		int noOfRotation = sc.nextInt();
		sc.nextLine();

		String sub = "";
		while(noOfRotation-- > 0) {
			String op = sc.nextLine();
			if(op.charAt(0) == 'L') {
				int index = op.charAt(2) - '0';
				sub += String.valueOf(str.charAt(index));
			} else {
				int index = str.length() - (op.charAt(2) - '0');
				sub += String.valueOf(str.charAt(index));
			}
		}
		
		char[] ch = sub.toCharArray();
		Arrays.sort(ch);

		if(checkAnagram(String.valueOf(ch), str))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}