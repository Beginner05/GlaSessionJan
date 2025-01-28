package Backtracking;

public class HackerBlocks {

	public static void main(String args[]) {
		String str = "1111";
		sol(str, "");
	}

	public static void sol(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			String temp = str.substring(0, i + 1);
			int val = Integer.parseInt(temp);
			if (val > 26)
				return;
			char ch = (char) (96 + val);
			sol(str.substring(i + 1), ans + ch);
		}
	}
}
