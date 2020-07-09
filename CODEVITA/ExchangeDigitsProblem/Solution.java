import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);
	private static Set<Integer> set = new HashSet<Integer>();

	private static void permutationGreaterThanSecNum(String str1, String str2, String res) {
		if(str1.length() == 0) {
			if(Integer.parseInt(res) > Integer.parseInt(str2))
				set.add(Integer.parseInt(res));
			else
				set.add(-1);
		} else {
			for(int i = 0; i < str1.length(); i++) {
				char temp = str1.charAt(i);

				String ros = str1.substring(0, i) + str1.substring(i + 1);
				permutationGreaterThanSecNum(ros, str2, res + temp);
			}
		}
	}

	private static int minValue() {
		if(set.size() == 1)
			return -1;
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);

		int min = Integer.MAX_VALUE;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < min && list.get(i) != -1)
				min = list.get(i);
		}
		return min;
	}

	public static void main(String[] args) {
		String str1 = sc.next();
		String str2 = sc.next();

		if(str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0)
			System.exit(-1);

		permutationGreaterThanSecNum(str1, str2, "");
		System.out.println(minValue());
	}
}