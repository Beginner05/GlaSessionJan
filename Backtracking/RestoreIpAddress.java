package Backtracking;

public class RestoreIpAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "25525511135";
		sol(str, "", 0);
	}

	public static void sol(String str, String ans, int cnt) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		if (cnt > 3)
			return;

		for (int i = 0; i < str.length(); i++) {
			String temp = str.substring(0, i + 1);
			int val = Integer.parseInt(temp);
			if (val > 255) {
				return;
			}
			if (cnt == 3)
				sol(str.substring(i + 1), ans + temp, cnt + 1);
			else
				sol(str.substring(i + 1), ans + temp + ".", cnt + 1);
		}

	}

}
